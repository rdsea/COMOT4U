# TU4UME

TU4UME is a UML Profile-driven, two-step UML2JSON transformation tool.
It generates a JAVA source code and APIs from Stereotypes, Classes, and InstanceSpecifications model elements. 
The resulting Java program is further extended with Google GSON library to generated the JSON output from the corresponding Java Objects corresponding to suitably annotated Classes and InstanceSpecifications model elements.

This work is partially funded by the H2020 Project U-Test http://www.u-test.eu/

Further details:

**Input (manual)**
-	UML Model serialized in Eclipse UML (.uml)
-	U-Test profiles to model uncertainty and Cloud/IoT resources

**Intermediate Output (generated)**
-	Java Program including 
-	Profile-Driven Java API to access UML representation of Cloud/IoT resources types (i.e., annotated UML Classes) and instances (i.e., annotated UML InstanceSpecification)
-	Google GSON, a Java serialization/deserialization library to convert Java Objects into JSON and back
-	Java Main Program that instantiates Java Objects from annotated UML Classes and UML InstanceSpecifications, invokes GSON, and generate JSON output

**Output (generated)**
-	JSON representation of Cloud/IoT resources, both at Class and InstanceSpecification levels.


Thanks to **Google GSON Library**, the runtime objects are correctly serialized in JSON.
It is worth noting that the design rationales TU4UME are 
- full control on UML2JSON transformation rules
- generation of POJO Java classes to instantiate runtime objects with a simple structure to obtain a easy-to-read serialization in JSON. 
Alternative, existing solution (e.g., EMF2JSON https://github.com/emfjson/emfjson-jackson), that serialize EMF-based Java Objects, generate a complex JSON structure resulting in very limited customization and reuse of the resulting JSON output.

Transformation Workflow Overview:
![N|Solid](https://github.com/tuwiendsg/COMOT4U/blob/master/docs/figures/example_fig1.PNG)

Technology Overview:
![N|Solid](https://github.com/tuwiendsg/COMOT4U/blob/master/docs/figures/example_fig1.PNG)

Example
![N|Solid](https://github.com/tuwiendsg/COMOT4U/blob/master/docs/figures/example_fig1.PNG)

