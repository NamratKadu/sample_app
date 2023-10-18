package Dem.tringle.utility;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.imageio.stream.ImageOutputStream;

import org.openqa.selenium.WebElement;

import demoTestBase.TestBase;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class ScreenShot  {
	public void  captureFullPageScreenShot(String fileName) throws IOException{
		
		AShot ashot=new AShot();
	BufferedImage imp=	ashot.shootingStrategy(ShootingStrategies.viewportPasting(3000)).takeScreenshot(TestBase.getDriver()).getImage();
	String baseDir=System.getProperty("user.dir");
	ImageIO.write(imp,"png",new File(  baseDir+"src\\main\\resources\\failedScreenShot/failed.png "+fileName));

	

	}
	
	public void captureElementScreenShot(WebElement element ) {
	
		// TODO Auto-generated method stub

	}

}
