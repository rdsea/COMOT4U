Plug-In which extends com.ibm.xtools.transform.uml2.java.internal.UML2JavaTransform.
Exports UML diagrams to Java classes, considering the stereotype attributes and exporting them as class fields.

To use the plug-in
 Install:
   - Import it in your RSA run-time and deploy it to local host (or install plug-in Jar from deployment).
   - Or just run as Eclipse Application the plug-in project (no install, local run)
 Use:
   - Create a new Transformation Configuration: "File -> New -> Other -> Transformations -> Transformation Configuration"
   - Choose transformation type: Check "show all transformations". Choose Java Transformations -> UML to Java (deprecated)
   - Assign transformation name and location of transformation file
   - Choose transformation source a package containing UML diagrams
   - Choose transformation target any project
   - Run the transformation


If the project has classes which have attributes of type Stereotype subclass, or have applied on them Stereotypes which in turn have Stereotype attributes, to obtain usable Java classes you must also convert the stereotypes to Java by following the following steps:
 - 1. Apply this transform to convert classes/enums from project containing the stereotype
 - 3. Apply the Stereotype2JavaTransformation to convert the Stereotypes in classes (https://github.com/tuwiendsg/COMOT4U/tree/master/IBM_RSA_Plugins/TUWUMLStereotype2JavaTransformation)
