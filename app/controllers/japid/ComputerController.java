package controllers.japid;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import models.japidsample.Computer;
import cn.bran.play.JapidController;

public class ComputerController extends JapidController{
	public static void allComputers() {
		List<Computer> computers = new ArrayList<Computer>();
		Computer c = new Computer();
		c.setName("IBM ThinkPad");
		c.setReleaseDate(new Date());
		c.setId(1L);
		computers.add(c);
		c = new Computer();
		c.setName("Dell Studio");
		c.setReleaseDate(new Date());
		c.setId(2L);
		computers.add(c);
		renderJapid(computers);
	}
}
