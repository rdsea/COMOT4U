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


To help with implementing the test plan, one can use the other TUW plug-ins to export as Java classes:
 - Stereotypes: https://github.com/tuwiendsg/COMOT4U/tree/master/IBM_RSA_Plugins/TUWUML2JavaStereotypeTransformationExtension
 - UML class diagrams containing entities with applied stereotypes: https://github.com/tuwiendsg/COMOT4U/tree/master/IBM_RSA_Plugins/TUWUMLStereotype2JavaTransformation


To extend the plug-in with custom strategies:
 1. Most important classes are:
   - AbstractTestStrategy: class which has the abstract "generateTestPlan" method. The class must be sub-classed and the method implemented for any custom strategy.
   - TestEngineFactory: factory class holding all supported strategies. Any new subclass of AbstractTestStrategy must be added in "supportedStrategies". After this they will appear on the selection tab and be called when required.
   - StateMachineStateGraph: class holding state machine parsed information. The class has methods ("toString", and "getStatesWithUncertainties()") which give good examples on how to go deeper and extract state information such as uncertainties, and the uncertainties' parameters.
   - StateMachineTransformationRule: class which contains the "createTarget" method which creates the StateMachineStateGraph from a state machine diagram. If user wants to add more information to StateMachineStateGraph then the rule can be modified to extract more information from the machine diagram.


