package qa.automated.web.bci.Launcher;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import qa.automated.web.bci.Runnings.RunningLista;

@RunWith(Suite.class)
@SuiteClasses({RunningLista.class})

public class LauncherList extends ApplicationLauncherAndroid{

}
