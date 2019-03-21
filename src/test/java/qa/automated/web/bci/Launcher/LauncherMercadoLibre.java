package qa.automated.web.bci.Launcher;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import qa.automated.web.bci.Runnings.RunningMercadoLibre;

@RunWith(Suite.class)
@SuiteClasses({RunningMercadoLibre.class})

public class LauncherMercadoLibre extends ApplicationLauncherAndroid{

}
