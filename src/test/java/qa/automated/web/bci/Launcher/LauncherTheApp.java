package qa.automated.web.bci.Launcher;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import qa.automated.web.bci.Runnings.RunningTheApp;

@RunWith(Suite.class)
@SuiteClasses({RunningTheApp.class})

public class LauncherTheApp extends ApplicationLauncherAndroid{
	

}
