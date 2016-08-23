Plug-In which provides a Transformation Extension to convert UML state machine diagrams into Abstract Test Plans.
 
The plug-in generates a Java class file for each state machine, representing a set of test plans to be implemented to test the state machine transitions.
The generated class is abstract because at this point it is unclear how to assert that a certain state has been reached. So all assert methods are left as abstract to be concretely implemented for particular systems.

The plug-in currently supports two test plan generation strategies:
 a. ac.at.tuwien.dsg.uml.statemachine.export.transformation.engines.impl.TransitionCorrectnessTestStrategy
    - This strategy generates a Test Plans which check correctness of state transitions by using a State Machine State Graph obtained from parsing a State Machine diagram.
 b. ac.at.tuwien.dsg.uml.statemachine.export.transformation.engines.impl.PathWithUncertaintyTestStrategy
    - This strategy generates Test Plans which check correctness of state transitions only for transition paths which have at least one uncertainty on at least one state.

To use the plug-in
 Install:
   - Import it in your RSA run-time and deploy it to local host (or install plug-in Jar from deployment).
   - Or just run as Eclipse Application the plug-in project (no install, local run)
 Use:
   - Create a new Transformation Configuration: "File -> New -> Other -> Transformations -> Transformation Configuration"
   - Choose transformation type: Check "show all transformations". 
   - Choose "ac.at.tuwien.dsg.uml.statemachine.export.transformation" -> "StateMachineTransformation"
   - From transformation "Source and Target" tab select source state machine diagram and target location where transformation file should be generated.
   - From "Select Test Generation Strategy" tab select the test generation strategy to use when generating the test plan.
   - Run the transformation
   - Right click on Target project and Refresh
   - Test plan generated file will be named [TestStrategySimpleName]_TestPlanForStateMachine_[StateMachineName]


