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
