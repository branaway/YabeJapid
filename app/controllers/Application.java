package controllers;

import japidviews.Application.anew;
import japidviews.Application.hello;
import japidviews.Application.index;
import japidviews.Application.listTagged;

import java.util.List;
import java.util.Map;

import models.Post;
import play.Play;
import play.cache.Cache;
import play.classloading.enhancers.ControllersEnhancer.ControllerInstrumentation;
import play.data.validation.Required;
import play.libs.Codec;
import play.libs.Images;
import play.mvc.Before;
import play.mvc.Http.Header;
import cn.bran.japid.template.ActionRunner;
import cn.bran.japid.template.RenderResult;
import cn.bran.play.CacheableRunner;
import cn.bran.play.JapidController;
import cn.bran.play.JapidResult;
import cn.bran.play.RenderResultCache;

public class Application extends JapidController {
	public static void hello() {
		throw new JapidResult(new hello().render("me"));
	}

	@Before
	static void addDefaults() {
		renderArgs.put("blogTitle", Play.configuration.getProperty("blog.title"));
		renderArgs.put("blogBaseline", Play.configuration.getProperty("blog.baseline"));
	}

	public static void index() {
		// System.out.println("got index");
		Post frontPost = Post.find("order by postedAt desc").first();
		List<Post> olderPosts = Post.find("order by postedAt desc").from(1).fetch(200);

		RenderResult rr = new index().render(frontPost, olderPosts);
		System.out.println("render complete");
		throw new JapidResult(rr);
	}

	public static void indexcached() {
		CacheableRunner cacheableRunner = new CacheableRunner("5s", "indexcached") {
			@Override
			protected RenderResult render() {
				System.out.println("indexcached: reload");
				Post frontPost = Post.find("order by postedAt desc").first();
				List<Post> olderPosts = Post.find("order by postedAt desc").from(1).fetch(200);

				RenderResult rr = new index().render(frontPost, olderPosts);
				return rr;
			}
		};

		render(cacheableRunner);// a JapidResult will be thrown out
	}

	/**
	 * another way to reuse another action which renders with Japid
	 */
	public static void indexcached2() {
		CacheableRunner cacheableRunner = new CacheableRunner("5s", "indexcached") {
			@Override
			protected RenderResult render() {
				System.out.println("indexcached2: reload");
				dontRedirect();
				index(); // this throws an JapidResult out
				return null;
			}
		};
		render(cacheableRunner);
	}

	public static void show(final Long id) {
		CacheableRunner cacheableRunner = new CacheableRunner("10s", "blog" + id) {
			@Override
			protected RenderResult render() {
				System.out.println("show: reload");
				Post post = Post.findById(id);
				RenderResult rr = new japidviews.Application.show().render(post);
				return rr;
			}
		};
		render(cacheableRunner);
	}

	public static void captchaBlock() {
		System.out.println("captcha: reload");
		final String randomID = Codec.UUID();
		RenderResult rr = new japidviews.Application.captchaBlock().render(randomID);
		render(rr);
	}

	public static void postComment(Long postId, @Required(message = "Author is required") String author,
			@Required(message = "A message is required") String content, @Required(message = "Please type the code") String code,
			String randomID) {
		Post post = Post.findById(postId);
		if (!Play.id.equals("test")) {
			validation.equals(code, Cache.get(randomID)).message("Invalid code. Please type it again");
		}
		if (validation.hasErrors()) {
			dontRedirect();
			show(postId);
//			render("Application/show.html", post, randomID);
		}
		post.addComment(author, content);
		flash.success("Thanks for posting, %s", author);
		ignoreCacheNowAndNext();
		show(postId);
	}

	public static void captcha(String id) {
		Images.Captcha captcha = Images.captcha();
		String code = captcha.getText("#E4EAFD");
		Cache.set(id, code, "30mn");
		renderBinary(captcha);
	}

	public static void listTagged(String tag) {
		List<Post> posts = Post.findTaggedWith(tag);
		// render(new listTagged().render(posts, tag));
		render(listTagged.class, posts, tag);
	}

	public static void anew() {
		throw new JapidResult(new anew().render());
	}

	public static void superpanel() {
		final String who = "God";
		CacheableRunner r = new CacheableRunner("12s", "super" + who) {

			@Override
			protected RenderResult render() {
				System.out.println("superpanel: reload");
				return new japidviews.Application.superpanel().render(who);
			}
		};

		render(r);

	}

	public static void panel1(final String who) {
		CacheableRunner r = new CacheableRunner("2s", "super1" + who) {
			@Override
			protected RenderResult render() {
				System.out.println("panel-1: reload");
				return new japidviews.Application.panel1().render(who);
			}
		};
		render(r);
	}

	public static void panel2(final String who) {
		CacheableRunner r = new CacheableRunner("6s", "super2" + who) {
			@Override
			protected RenderResult render() {
				System.out.println("panel-2: reload");
				return new japidviews.Application.panel2().render(who);
			}
		};
		render(r);

	}

	/**
	 * this should trigger a http redirect
	 */
	public static void jump2superpanel() {
		superpanel();
	}
	
	public static void headers() {
		StringBuilder sb = new StringBuilder();
		Map<String, Header> map = request.headers;
		for (String k : map.keySet()) {
			sb.append(k).append("|");
			Header vs = map.get(k);
			sb.append(vs.name).append("|");
			for (String l : vs.values) {
				sb.append(l + ":");
			}
			sb.append('\n');
		}
		sb.append('\n');
		sb.append("ignore Cache? " + RenderResultCache.shouldIgnoreCache());

		render(new hello().render(sb.toString()));
	}

}
