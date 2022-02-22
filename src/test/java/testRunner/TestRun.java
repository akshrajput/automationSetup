package testRunner;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(features = "src/test/java/Fetures/", 
glue = "stepDefinitions", 
dryRun = false,
monochrome=true, 
plugin = { "pretty", "html:test-output" }

)

public class TestRun  {

}
	 
//	public class TestRun {
//	     
//	    private TestNGCucumberRunner testNGCucumberRunner;
//	      
//	    @BeforeClass()
//	    public void setUpClass() throws Exception {
//	        testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
//	    }
//	     
//	   // @Test(dataProvider="features")
//	    @Test
//	      public void my_test(PickleWrapper pickle, FeatureWrapper cucumberFeature)        {
//	        testNGCucumberRunner.runScenario(pickle.getPickle());
//	    }
//	     
//	     
////	    @DataProvider
////	    public Object[][] features()
////	    {
////	        //return testNGCucumberRunner.provideFeatures();      
////	    }
//	     
//	     
//	    @AfterClass
//	    public void tearDown()
//	    {
//	        testNGCucumberRunner.finish();
//	         
//	    }
	//}

