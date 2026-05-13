package appls;

import robots.RobotObj26;
import unibo.basicomm23.interfaces.IApplMessage;
import unibo.basicomm23.interfaces.IObserverMsg;
import unibo.basicomm23.utils.CommUtils;
import unibo.basicomm23.utils.LogUtils;

public class MyBoundaryRobotWithSonarStop implements IObserverMsg {
	
	private RobotObj26 robot;
	private int n = 0;
    private String logFName = "vrusage26.log"; //see logback.xml
     private int stepTime = 345;   //sonar at 0.19
    private LogUtils log  = new LogUtils("bstep");
    private boolean stoppedBySonar = false;
 
    public MyBoundaryRobotWithSonarStop(String addr) {
        CommUtils.outblue("TestMovesUsingWs |  CREATING ..." + addr);  
        robot = RobotObj26.create(addr, this,logFName);
        //robot.setTrace(true);
        log.clearlog("logs/"+logFName);
        CommUtils.aboutThreads("main");
    }
    
    //Basato su step sincorno. Molto più semplice ....
    public void doJob() throws Exception {
    	askUser();
    	robot.halt();
     	while( n < 4 ) {
    		walk();
    		CommUtils.outblue("turning");
			log.info("turned when n="+n);
			robot.turnLeft();
    		n++;
     	}
     }
     
    protected void walk() throws Exception{
       	boolean r = robot.step(stepTime);
       	while( r ) {
       		r = robot.step(stepTime) && !stoppedBySonar;
       	}
    }
    
    protected void askUser() {
    	CommUtils.waitTheUser("PUT ROBOT in HOME and hit");
    }   
 /*
MAIN
 */
    public static void main(String[] args) {
        try{
    		CommUtils.aboutThreads("Before start - ");
    		MyBoundaryRobotWithSonarStop appl = new MyBoundaryRobotWithSonarStop( "localhost" );
            appl.doJob();
         	CommUtils.aboutThreads("At end - ");
        } catch( Exception ex ) {
            CommUtils.outred("BoundaryUsingVrBasicAdapter | main ERROR: " + ex.getMessage());
        }
    }

	@Override
	public void update(IApplMessage msg) {
		// TODO Auto-generated method stub
		CommUtils.outcyan(msg.msgId());
		if( msg.msgId().equals("sonardata")) {
			CommUtils.delay(1000);
		}
	}

}
