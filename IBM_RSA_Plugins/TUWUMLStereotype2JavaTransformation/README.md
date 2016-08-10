Plug-In which exports only Stereotypes to JavaClasses.

To use the plug-in
 Install:
   - Import it in your RSA run-time and deploy it to local host (or install plug-in Jar from deployment).
   - Or just run as Eclipse Application the plug-in project (no install, local run)
 Use:
   - Create a new Transformation Configuration: "File -> New -> Other -> Transformations -> Transformation Configuration"
   - Choose transformation type: Check "show all transformations". Choose ac.at.tuwien.dsg.uml.stereotype.export.transformation -> Stereotype2JavaTransformation
   - Assign transformation name and location of transformation file
   - Choose transformation source a package containing UML Stereotypes.
   - Choose transformation target the "src" dir of any project
   - Run the transformation
   - Right click -> Refresh the project chosen as target
