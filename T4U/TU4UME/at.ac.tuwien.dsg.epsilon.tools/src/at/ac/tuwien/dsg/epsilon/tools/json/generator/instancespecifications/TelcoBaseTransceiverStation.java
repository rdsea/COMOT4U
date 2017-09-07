package at.ac.tuwien.dsg.epsilon.tools.json.generator.instancespecifications;

import at.ac.tuwien.dsg.epsilon.tools.json.generator.instancespecifications.wrappers.*;

import at.ac.tuwien.dsg.profiles.infrastructurecpsprofile.stereotypes.pojos.*;
import at.ac.tuwien.dsg.epsilon.tools.SampleTool;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;





public class  TelcoBaseTransceiverStation{

	//*************************************************
	// Global variables
	//*************************************************
	private boolean showEmpty = true;
	private List<Object> all_pojos = new ArrayList<Object>();
	private List<Object> all_virtual_sensors = new ArrayList<Object>();
	private List<Object> all_virtual_gateways = new ArrayList<Object>();
	private List<Object> all_virtual_actuators = new ArrayList<Object>();
	private List<Object> all_sensors = new ArrayList<Object>();
	private List<Object> all_actuators = new ArrayList<Object>();
	private List<Object> all_communications = new ArrayList<Object>();
	private List<Object> all_communication_configurations = new ArrayList<Object>();
	private List<Object> all_computing_configurations = new ArrayList<Object>();
	private List<Object> all_storage_configurations = new ArrayList<Object>();
	private List<Object> all_cloud_services = new ArrayList<Object>();

	private List<Object> all_pojos_je = new ArrayList<Object>();
	private List<Object> all_virtual_sensors_je = new ArrayList<Object>();
	private List<Object> all_virtual_gateways_je = new ArrayList<Object>();
	private List<Object> all_virtual_actuators_je = new ArrayList<Object>();
	private List<Object> all_sensors_je = new ArrayList<Object>();
	private List<Object> all_actuators_je = new ArrayList<Object>();
	private List<Object> all_communications_je = new ArrayList<Object>();
	private List<Object> all_communication_configurations_je = new ArrayList<Object>();
	private List<Object> all_computing_configurations_je = new ArrayList<Object>();
	private List<Object> all_storage_configurations_je = new ArrayList<Object>();
	private List<Object> all_cloud_services_je = new ArrayList<Object>();

	private List<Object> all_pojos_jo = new ArrayList<Object>();
	private List<Object> all_virtual_sensors_jo = new ArrayList<Object>();
	private List<Object> all_virtual_gateways_jo = new ArrayList<Object>();
	private List<Object> all_virtual_actuators_jo = new ArrayList<Object>();
	private List<Object> all_sensors_jo = new ArrayList<Object>();
	private List<Object> all_actuators_jo = new ArrayList<Object>();
	private List<Object> all_communications_jo = new ArrayList<Object>();
	private List<Object> all_communication_configurations_jo = new ArrayList<Object>();
	private List<Object> all_computing_configurations_jo = new ArrayList<Object>();
	private List<Object> all_storage_configurations_jo = new ArrayList<Object>();
	private List<Object> all_cloud_services_jo = new ArrayList<Object>();

	private List<Object> all_pojos_string = new ArrayList<Object>();
	private List<Object> all_virtual_sensors_string = new ArrayList<Object>();
	private List<Object> all_virtual_gateways_string = new ArrayList<Object>();
	private List<Object> all_virtual_actuators_string = new ArrayList<Object>();
	private List<Object> all_sensors_string = new ArrayList<Object>();
	private List<Object> all_actuators_string = new ArrayList<Object>();
	private List<Object> all_communications_string = new ArrayList<Object>();
	private List<Object> all_communication_configurations_string = new ArrayList<Object>();
	private List<Object> all_computing_configurations_string = new ArrayList<Object>();
	private List<Object> all_storage_configurations_string = new ArrayList<Object>();
	private List<Object> all_cloud_services_string = new ArrayList<Object>();
	
	private List<Object> all_pojos_wrapper = new ArrayList<Object>();
	private List<Object> all_virtual_sensors_wrapper = new ArrayList<Object>();
	private List<Object> all_virtual_gateways_wrapper = new ArrayList<Object>();
	private List<Object> all_virtual_actuators_wrapper = new ArrayList<Object>();
	private List<Object> all_sensors_wrapper = new ArrayList<Object>();
	private List<Object> all_actuators_wrapper = new ArrayList<Object>();
	private List<Object> all_communications_wrapper = new ArrayList<Object>();
	private List<Object> all_communication_configurations_wrapper = new ArrayList<Object>();
	private List<Object> all_computing_configurations_wrapper = new ArrayList<Object>();
	private List<Object> all_storage_configurations_wrapper = new ArrayList<Object>();
	private List<Object> all_cloud_services_wrapper = new ArrayList<Object>();
	
	public static void main(String[] args) {

	    Gson gson = new GsonBuilder().setPrettyPrinting().create();
	    JsonParser jp = new JsonParser();
	    
		TelcoBaseTransceiverStation telcoBaseTransceiverStation = new TelcoBaseTransceiverStation();

//*************************************************
//Cloud Services
//*************************************************
//*************************************************
//Cloud Service BTSBroker1Local
//*************************************************
		CloudService cloud_service_BTSBroker1Local_1 = new CloudService();
		telcoBaseTransceiverStation.all_pojos.add(cloud_service_BTSBroker1Local_1);
		telcoBaseTransceiverStation.all_cloud_services.add(cloud_service_BTSBroker1Local_1);

		BTSBroker1LocalWrapper cloud_service_BTSBroker1Local_1_wrapper = new BTSBroker1LocalWrapper();
		cloud_service_BTSBroker1Local_1_wrapper.setBTSBroker1Local(cloud_service_BTSBroker1Local_1);
		telcoBaseTransceiverStation.all_pojos_wrapper.add(cloud_service_BTSBroker1Local_1_wrapper);
		telcoBaseTransceiverStation.all_cloud_services_wrapper.add(cloud_service_BTSBroker1Local_1_wrapper);
		cloud_service_BTSBroker1Local_1.addId("_vPmLUJJMEeeeSL7FBGSdJA");
		cloud_service_BTSBroker1Local_1.setName("BTSBroker");
		cloud_service_BTSBroker1Local_1.addServiceType("VM");
		cloud_service_BTSBroker1Local_1.addCloudProvider("");
		cloud_service_BTSBroker1Local_1.addDataProvider("");
		//*************************************************
		//Json Conversion
		//*************************************************		
	    JsonElement cloud_service_BTSBroker1Local_1_je = gson.toJsonTree(cloud_service_BTSBroker1Local_1);
	    telcoBaseTransceiverStation.all_cloud_services_je.add(cloud_service_BTSBroker1Local_1_je);
	    
	    JsonObject cloud_service_BTSBroker1Local_1_jo = new JsonObject();
	    telcoBaseTransceiverStation.all_cloud_services_jo.add(cloud_service_BTSBroker1Local_1_jo);
	    
	    cloud_service_BTSBroker1Local_1_jo.add("BTSBroker1Local", cloud_service_BTSBroker1Local_1_je);

//*************************************************
//Cloud Service BTSBroker2Google
//*************************************************
		CloudService cloud_service_BTSBroker2Google_2 = new CloudService();
		telcoBaseTransceiverStation.all_pojos.add(cloud_service_BTSBroker2Google_2);
		telcoBaseTransceiverStation.all_cloud_services.add(cloud_service_BTSBroker2Google_2);

		BTSBroker2GoogleWrapper cloud_service_BTSBroker2Google_2_wrapper = new BTSBroker2GoogleWrapper();
		cloud_service_BTSBroker2Google_2_wrapper.setBTSBroker2Google(cloud_service_BTSBroker2Google_2);
		telcoBaseTransceiverStation.all_pojos_wrapper.add(cloud_service_BTSBroker2Google_2_wrapper);
		telcoBaseTransceiverStation.all_cloud_services_wrapper.add(cloud_service_BTSBroker2Google_2_wrapper);
		cloud_service_BTSBroker2Google_2.addId("_CmlOIJJNEeeeSL7FBGSdJA");
		cloud_service_BTSBroker2Google_2.setName("BTSBroker");
		cloud_service_BTSBroker2Google_2.addServiceType("VM");
		cloud_service_BTSBroker2Google_2.addCloudProvider("");
		cloud_service_BTSBroker2Google_2.addDataProvider("");
		//*************************************************
		//Json Conversion
		//*************************************************		
	    JsonElement cloud_service_BTSBroker2Google_2_je = gson.toJsonTree(cloud_service_BTSBroker2Google_2);
	    telcoBaseTransceiverStation.all_cloud_services_je.add(cloud_service_BTSBroker2Google_2_je);
	    
	    JsonObject cloud_service_BTSBroker2Google_2_jo = new JsonObject();
	    telcoBaseTransceiverStation.all_cloud_services_jo.add(cloud_service_BTSBroker2Google_2_jo);
	    
	    cloud_service_BTSBroker2Google_2_jo.add("BTSBroker2Google", cloud_service_BTSBroker2Google_2_je);

    



//*************************************************
//Virtual Sensors
//*************************************************




//*************************************************
//Virtual Sensor TemperatureSensor1
//*************************************************
		VirtualSensor virtual_sensor_TemperatureSensor1_1 = new VirtualSensor();
		telcoBaseTransceiverStation.all_pojos.add(virtual_sensor_TemperatureSensor1_1);
		telcoBaseTransceiverStation.all_virtual_sensors.add(virtual_sensor_TemperatureSensor1_1);

		VirtualSensorWrapper virtual_sensor_TemperatureSensor1_1_wrapper= new VirtualSensorWrapper();
		telcoBaseTransceiverStation.all_pojos_wrapper.add(virtual_sensor_TemperatureSensor1_1_wrapper);
		telcoBaseTransceiverStation.all_virtual_sensors_wrapper.add(virtual_sensor_TemperatureSensor1_1_wrapper);

		virtual_sensor_TemperatureSensor1_1_wrapper.setVirtualSensor(virtual_sensor_TemperatureSensor1_1);

		virtual_sensor_TemperatureSensor1_1.addId("_vz9ukJJKEeeeSL7FBGSdJA");
		virtual_sensor_TemperatureSensor1_1.setName("TemperatureSensor");	
		virtual_sensor_TemperatureSensor1_1.addLocation("");
		virtual_sensor_TemperatureSensor1_1.addDescription("");
		virtual_sensor_TemperatureSensor1_1.addHasTimestampMechanism("false");
		virtual_sensor_TemperatureSensor1_1.addTimestampMaxLatency("");
		//*************************************************
		//Json Conversion
		//*************************************************		
	    JsonElement virtual_sensor_TemperatureSensor1_1_je = gson.toJsonTree(virtual_sensor_TemperatureSensor1_1);
	    telcoBaseTransceiverStation.all_virtual_sensors_je.add(virtual_sensor_TemperatureSensor1_1_je);
	    
	    JsonObject virtual_sensor_TemperatureSensor1_1_jo = new JsonObject();
	    telcoBaseTransceiverStation.all_virtual_sensors_jo.add(virtual_sensor_TemperatureSensor1_1_jo);
	    
	    virtual_sensor_TemperatureSensor1_1_jo.add("TemperatureSensor1", virtual_sensor_TemperatureSensor1_1_je);


//*************************************************
//Virtual Sensor ElectricitySensor1
//*************************************************
		VirtualSensor virtual_sensor_ElectricitySensor1_2 = new VirtualSensor();
		telcoBaseTransceiverStation.all_pojos.add(virtual_sensor_ElectricitySensor1_2);
		telcoBaseTransceiverStation.all_virtual_sensors.add(virtual_sensor_ElectricitySensor1_2);

		VirtualSensorWrapper virtual_sensor_ElectricitySensor1_2_wrapper= new VirtualSensorWrapper();
		telcoBaseTransceiverStation.all_pojos_wrapper.add(virtual_sensor_ElectricitySensor1_2_wrapper);
		telcoBaseTransceiverStation.all_virtual_sensors_wrapper.add(virtual_sensor_ElectricitySensor1_2_wrapper);

		virtual_sensor_ElectricitySensor1_2_wrapper.setVirtualSensor(virtual_sensor_ElectricitySensor1_2);

		virtual_sensor_ElectricitySensor1_2.addId("_7dxDQJJKEeeeSL7FBGSdJA");
		virtual_sensor_ElectricitySensor1_2.setName("ElectricitySensor");	
		virtual_sensor_ElectricitySensor1_2.addLocation("");
		virtual_sensor_ElectricitySensor1_2.addDescription("");
		virtual_sensor_ElectricitySensor1_2.addHasTimestampMechanism("false");
		virtual_sensor_ElectricitySensor1_2.addTimestampMaxLatency("");
		//*************************************************
		//Json Conversion
		//*************************************************		
	    JsonElement virtual_sensor_ElectricitySensor1_2_je = gson.toJsonTree(virtual_sensor_ElectricitySensor1_2);
	    telcoBaseTransceiverStation.all_virtual_sensors_je.add(virtual_sensor_ElectricitySensor1_2_je);
	    
	    JsonObject virtual_sensor_ElectricitySensor1_2_jo = new JsonObject();
	    telcoBaseTransceiverStation.all_virtual_sensors_jo.add(virtual_sensor_ElectricitySensor1_2_jo);
	    
	    virtual_sensor_ElectricitySensor1_2_jo.add("ElectricitySensor1", virtual_sensor_ElectricitySensor1_2_je);


//*************************************************
//Virtual Sensor AirConditioningSensor1
//*************************************************
		VirtualSensor virtual_sensor_AirConditioningSensor1_3 = new VirtualSensor();
		telcoBaseTransceiverStation.all_pojos.add(virtual_sensor_AirConditioningSensor1_3);
		telcoBaseTransceiverStation.all_virtual_sensors.add(virtual_sensor_AirConditioningSensor1_3);

		VirtualSensorWrapper virtual_sensor_AirConditioningSensor1_3_wrapper= new VirtualSensorWrapper();
		telcoBaseTransceiverStation.all_pojos_wrapper.add(virtual_sensor_AirConditioningSensor1_3_wrapper);
		telcoBaseTransceiverStation.all_virtual_sensors_wrapper.add(virtual_sensor_AirConditioningSensor1_3_wrapper);

		virtual_sensor_AirConditioningSensor1_3_wrapper.setVirtualSensor(virtual_sensor_AirConditioningSensor1_3);

		virtual_sensor_AirConditioningSensor1_3.addId("_8jQrsJJKEeeeSL7FBGSdJA");
		virtual_sensor_AirConditioningSensor1_3.setName("AirConditioningSensor");	
		virtual_sensor_AirConditioningSensor1_3.addLocation("");
		virtual_sensor_AirConditioningSensor1_3.addDescription("");
		virtual_sensor_AirConditioningSensor1_3.addHasTimestampMechanism("false");
		virtual_sensor_AirConditioningSensor1_3.addTimestampMaxLatency("");
		//*************************************************
		//Json Conversion
		//*************************************************		
	    JsonElement virtual_sensor_AirConditioningSensor1_3_je = gson.toJsonTree(virtual_sensor_AirConditioningSensor1_3);
	    telcoBaseTransceiverStation.all_virtual_sensors_je.add(virtual_sensor_AirConditioningSensor1_3_je);
	    
	    JsonObject virtual_sensor_AirConditioningSensor1_3_jo = new JsonObject();
	    telcoBaseTransceiverStation.all_virtual_sensors_jo.add(virtual_sensor_AirConditioningSensor1_3_jo);
	    
	    virtual_sensor_AirConditioningSensor1_3_jo.add("AirConditioningSensor1", virtual_sensor_AirConditioningSensor1_3_je);



//*************************************************
//Virtual Gateways
//*************************************************




//*************************************************
//Virtual Gateway IoTGateway1
//*************************************************
		VirtualGateway virtual_gateway_IoTGateway1_1 = new VirtualGateway();
		telcoBaseTransceiverStation.all_pojos.add(virtual_gateway_IoTGateway1_1);
		telcoBaseTransceiverStation.all_virtual_gateways.add(virtual_gateway_IoTGateway1_1);

		VirtualGatewayWrapper virtual_gateway_IoTGateway1_1_wrapper = new VirtualGatewayWrapper();
		telcoBaseTransceiverStation.all_pojos_wrapper.add(virtual_gateway_IoTGateway1_1_wrapper);
		telcoBaseTransceiverStation.all_virtual_gateways_wrapper.add(virtual_gateway_IoTGateway1_1_wrapper);

		virtual_gateway_IoTGateway1_1_wrapper.setVirtualGateway(virtual_gateway_IoTGateway1_1);

		virtual_gateway_IoTGateway1_1.addId("_Jf79gJJLEeeeSL7FBGSdJA");
		virtual_gateway_IoTGateway1_1.setName("IoTGateway");	
		virtual_gateway_IoTGateway1_1.addLocation("");
		virtual_gateway_IoTGateway1_1.addDescription("");
		virtual_gateway_IoTGateway1_1.addHasTimestampMechanism("false");
		virtual_gateway_IoTGateway1_1.addTimestampMaxLatency("");
		//*************************************************
		//Json Conversion
		//*************************************************		
	    JsonElement virtual_gateway_IoTGateway1_1_je = gson.toJsonTree(virtual_gateway_IoTGateway1_1);
	    telcoBaseTransceiverStation.all_virtual_gateways_je.add(virtual_gateway_IoTGateway1_1_je);
	    
	    JsonObject virtual_gateway_IoTGateway1_1_jo = new JsonObject();
	    telcoBaseTransceiverStation.all_virtual_gateways_jo.add(virtual_gateway_IoTGateway1_1_jo);
	    
	    virtual_gateway_IoTGateway1_1_jo.add("IoTGateway1", virtual_gateway_IoTGateway1_1_je);



//*************************************************
//Sensor HardwareElectricitySensor1
//*************************************************
		Sensor sensor_HardwareElectricitySensor1_1 = new Sensor();
		telcoBaseTransceiverStation.all_pojos.add(sensor_HardwareElectricitySensor1_1);
		telcoBaseTransceiverStation.all_sensors.add(sensor_HardwareElectricitySensor1_1);

		SensorWrapper sensor_HardwareElectricitySensor1_1_wrapper = new SensorWrapper();
		telcoBaseTransceiverStation.all_pojos_wrapper.add(sensor_HardwareElectricitySensor1_1_wrapper);
		telcoBaseTransceiverStation.all_sensors_wrapper.add(sensor_HardwareElectricitySensor1_1_wrapper);

		sensor_HardwareElectricitySensor1_1_wrapper.setSensor(sensor_HardwareElectricitySensor1_1);
		sensor_HardwareElectricitySensor1_1.addId("_KJNukJJMEeeeSL7FBGSdJA");
		sensor_HardwareElectricitySensor1_1.setName("HwElectricitySensor");	
		sensor_HardwareElectricitySensor1_1.addLocation("");
		sensor_HardwareElectricitySensor1_1.addDescription("");
		sensor_HardwareElectricitySensor1_1.addHasTimestampMechanism("false");
		sensor_HardwareElectricitySensor1_1.addTimestampMaxLatency("");
		//*************************************************
		//Json Conversion
		//*************************************************		
	    JsonElement sensor_HardwareElectricitySensor1_1_je = gson.toJsonTree(sensor_HardwareElectricitySensor1_1);
	    telcoBaseTransceiverStation.all_sensors_je.add(sensor_HardwareElectricitySensor1_1_je);
	    
	    JsonObject sensor_HardwareElectricitySensor1_1_jo = new JsonObject();
	    telcoBaseTransceiverStation.all_sensors_jo.add(sensor_HardwareElectricitySensor1_1_jo);
	    
	    sensor_HardwareElectricitySensor1_1_jo.add("HardwareElectricitySensor1", sensor_HardwareElectricitySensor1_1_je);


//*************************************************
//Sensor HwAirConditioningSensor1
//*************************************************
		Sensor sensor_HwAirConditioningSensor1_2 = new Sensor();
		telcoBaseTransceiverStation.all_pojos.add(sensor_HwAirConditioningSensor1_2);
		telcoBaseTransceiverStation.all_sensors.add(sensor_HwAirConditioningSensor1_2);

		SensorWrapper sensor_HwAirConditioningSensor1_2_wrapper = new SensorWrapper();
		telcoBaseTransceiverStation.all_pojos_wrapper.add(sensor_HwAirConditioningSensor1_2_wrapper);
		telcoBaseTransceiverStation.all_sensors_wrapper.add(sensor_HwAirConditioningSensor1_2_wrapper);

		sensor_HwAirConditioningSensor1_2_wrapper.setSensor(sensor_HwAirConditioningSensor1_2);
		sensor_HwAirConditioningSensor1_2.addId("_UCjyQJJMEeeeSL7FBGSdJA");
		sensor_HwAirConditioningSensor1_2.setName("HwAirConditioningSensor");	
		sensor_HwAirConditioningSensor1_2.addLocation("");
		sensor_HwAirConditioningSensor1_2.addDescription("");
		sensor_HwAirConditioningSensor1_2.addHasTimestampMechanism("false");
		sensor_HwAirConditioningSensor1_2.addTimestampMaxLatency("");
		//*************************************************
		//Json Conversion
		//*************************************************		
	    JsonElement sensor_HwAirConditioningSensor1_2_je = gson.toJsonTree(sensor_HwAirConditioningSensor1_2);
	    telcoBaseTransceiverStation.all_sensors_je.add(sensor_HwAirConditioningSensor1_2_je);
	    
	    JsonObject sensor_HwAirConditioningSensor1_2_jo = new JsonObject();
	    telcoBaseTransceiverStation.all_sensors_jo.add(sensor_HwAirConditioningSensor1_2_jo);
	    
	    sensor_HwAirConditioningSensor1_2_jo.add("HwAirConditioningSensor1", sensor_HwAirConditioningSensor1_2_je);


//*************************************************
//Sensor HwTemperatureSensor1
//*************************************************
		Sensor sensor_HwTemperatureSensor1_3 = new Sensor();
		telcoBaseTransceiverStation.all_pojos.add(sensor_HwTemperatureSensor1_3);
		telcoBaseTransceiverStation.all_sensors.add(sensor_HwTemperatureSensor1_3);

		SensorWrapper sensor_HwTemperatureSensor1_3_wrapper = new SensorWrapper();
		telcoBaseTransceiverStation.all_pojos_wrapper.add(sensor_HwTemperatureSensor1_3_wrapper);
		telcoBaseTransceiverStation.all_sensors_wrapper.add(sensor_HwTemperatureSensor1_3_wrapper);

		sensor_HwTemperatureSensor1_3_wrapper.setSensor(sensor_HwTemperatureSensor1_3);
		sensor_HwTemperatureSensor1_3.addId("_VUWxUJJMEeeeSL7FBGSdJA");
		sensor_HwTemperatureSensor1_3.setName("HwTemperatureSensor");	
		sensor_HwTemperatureSensor1_3.addLocation("");
		sensor_HwTemperatureSensor1_3.addDescription("");
		sensor_HwTemperatureSensor1_3.addHasTimestampMechanism("false");
		sensor_HwTemperatureSensor1_3.addTimestampMaxLatency("");
		//*************************************************
		//Json Conversion
		//*************************************************		
	    JsonElement sensor_HwTemperatureSensor1_3_je = gson.toJsonTree(sensor_HwTemperatureSensor1_3);
	    telcoBaseTransceiverStation.all_sensors_je.add(sensor_HwTemperatureSensor1_3_je);
	    
	    JsonObject sensor_HwTemperatureSensor1_3_jo = new JsonObject();
	    telcoBaseTransceiverStation.all_sensors_jo.add(sensor_HwTemperatureSensor1_3_jo);
	    
	    sensor_HwTemperatureSensor1_3_jo.add("HwTemperatureSensor1", sensor_HwTemperatureSensor1_3_je);

    

//*************************************************
//Virtual Actuators
//*************************************************




//*************************************************
//Communications
//*************************************************





//*************************************************
//communication_configurations
//*************************************************



//*************************************************
//computing_configurations
//*************************************************


//*************************************************
//storage_configurations
//*************************************************

		JsonElement je = null;
		String je_string = null;
		//*************************************************
		//Serialization of Cloud Services
		//*************************************************    

		for (Iterator iterator = telcoBaseTransceiverStation.all_cloud_services_jo.iterator(); iterator.hasNext();) {
			JsonObject elem = (JsonObject) iterator.next();
			je = jp.parse(elem.toString());
			telcoBaseTransceiverStation.all_cloud_services_je.add(je);
			je_string = gson.toJson(je);
			telcoBaseTransceiverStation.all_cloud_services_string.add(je_string);
			System.out.println(je_string);			
		}

		//*************************************************
		//Serialization of Virtual Sensors
		//*************************************************    
		
		for (Iterator iterator = telcoBaseTransceiverStation.all_virtual_sensors_jo.iterator(); iterator.hasNext();) {
			JsonObject elem = (JsonObject) iterator.next();
			je = jp.parse(elem.toString());
			telcoBaseTransceiverStation.all_virtual_sensors_je.add(je);
			je_string = gson.toJson(je);
			telcoBaseTransceiverStation.all_virtual_sensors_string.add(je_string);
			System.out.println(je_string);			
		}
		
		//*************************************************
		//Serialization of Sensors
		//*************************************************    
		
		for (Iterator iterator = telcoBaseTransceiverStation.all_sensors_jo.iterator(); iterator.hasNext();) {
			JsonObject elem = (JsonObject) iterator.next();
			je = jp.parse(elem.toString());
			telcoBaseTransceiverStation.all_sensors_je.add(je);
			je_string = gson.toJson(je);
			telcoBaseTransceiverStation.all_sensors_string.add(je_string);
			System.out.println(je_string);			
		}

		//*************************************************
		//Serialization of Virtual Gateways
		//*************************************************    
		
		for (Iterator iterator = telcoBaseTransceiverStation.all_virtual_gateways_jo.iterator(); iterator.hasNext();) {
			JsonObject elem = (JsonObject) iterator.next();
			je = jp.parse(elem.toString());
			telcoBaseTransceiverStation.all_virtual_gateways_je.add(je);
			je_string = gson.toJson(je);
			telcoBaseTransceiverStation.all_virtual_gateways_string.add(je_string);
			System.out.println(je_string);			
		}	
		
		//*************************************************
		//Serialization of Virtual Actuator
		//*************************************************    
		
		for (Iterator iterator = telcoBaseTransceiverStation.all_virtual_actuators_jo.iterator(); iterator.hasNext();) {
			JsonObject elem = (JsonObject) iterator.next();
			je = jp.parse(elem.toString());
			telcoBaseTransceiverStation.all_virtual_actuators_je.add(je);
			je_string = gson.toJson(je);
			telcoBaseTransceiverStation.all_virtual_actuators_string.add(je_string);
			System.out.println(je_string);			
		}
		
		//*************************************************
		//Serialization of Actuator
		//*************************************************    
		
		for (Iterator iterator = telcoBaseTransceiverStation.all_actuators_jo.iterator(); iterator.hasNext();) {
			JsonObject elem = (JsonObject) iterator.next();
			je = jp.parse(elem.toString());
			telcoBaseTransceiverStation.all_actuators_je.add(je);
			je_string = gson.toJson(je);
			telcoBaseTransceiverStation.all_actuators_string.add(je_string);
			System.out.println(je_string);			
		}
				
		//*************************************************
		//Serialization of Communication
		//*************************************************    
		
		for (Iterator iterator = telcoBaseTransceiverStation.all_communications_jo.iterator(); iterator.hasNext();) {
			JsonObject elem = (JsonObject) iterator.next();
			je = jp.parse(elem.toString());
			telcoBaseTransceiverStation.all_communications_je.add(je);
			je_string = gson.toJson(je);
			telcoBaseTransceiverStation.all_communications_string.add(je_string);
			System.out.println(je_string);			
		}	
		
					
		String output = gson.toJson(telcoBaseTransceiverStation.all_pojos);
		String output_virtual_sensors = gson.toJson(telcoBaseTransceiverStation.all_virtual_sensors);
		String output_virtual_gateways = gson.toJson(telcoBaseTransceiverStation.all_virtual_gateways);
		String output_sensors = gson.toJson(telcoBaseTransceiverStation.all_sensors);
		String output_actuators = gson.toJson(telcoBaseTransceiverStation.all_actuators);
		String output_communications = gson.toJson(telcoBaseTransceiverStation.all_communications);
		String output_communication_configurations = gson.toJson(telcoBaseTransceiverStation.all_communication_configurations);
		String output_cloud_services = gson.toJson(telcoBaseTransceiverStation.all_cloud_services);
		//System.out.println(output_virtual_sensors);
		//System.out.println(output_virtual_gateways);
		//System.out.println(output_sensors);
		//System.out.println(output_actuators);
		//System.out.println(output_communications);
		//System.out.println(output_communication_configurations);
		//System.out.println(output_cloud_services);
		//System.out.println(output);
		
		//wrapper elements
		
		String output_wrapper = gson.toJson(telcoBaseTransceiverStation.all_pojos_wrapper);
		String output_virtual_sensors_wrapper = gson.toJson(telcoBaseTransceiverStation.all_virtual_sensors_wrapper);
		String output_virtual_gateways_wrapper = gson.toJson(telcoBaseTransceiverStation.all_virtual_gateways_wrapper);
		String output_sensors_wrapper = gson.toJson(telcoBaseTransceiverStation.all_sensors_wrapper);
		String output_actuators_wrapper = gson.toJson(telcoBaseTransceiverStation.all_actuators_wrapper);
		String output_communications_wrapper = gson.toJson(telcoBaseTransceiverStation.all_communications_wrapper);
		String output_communication_configurations_wrapper = gson.toJson(telcoBaseTransceiverStation.all_communication_configurations_wrapper);
		String output_cloud_services_wrapper = gson.toJson(telcoBaseTransceiverStation.all_cloud_services_wrapper);
		//System.out.println(output_virtual_sensors_wrapper);
		//System.out.println(output_virtual_gateways_wrapper);
		//System.out.println(output_sensors_wrapper);
		//System.out.println(output_actuators_wrapper);
		//System.out.println(output_communications_wrapper);
		//System.out.println(output_communication_configurations_wrapper);
		//System.out.println(output_cloud_services_wrapper);
		//System.out.println(output_wrapper);
	
	}
	
	
}
