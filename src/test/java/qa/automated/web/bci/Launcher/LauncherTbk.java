package qa.automated.web.bci.Launcher;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import qa.automated.web.bci.Runnings.RunningTbk;

@RunWith(Suite.class)
@SuiteClasses({RunningTbk.class})
public class LauncherTbk extends ApplicationLauncherAndroid{
	
}
