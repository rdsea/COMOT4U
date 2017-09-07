package at.ac.tuwien.dsg.epsilon.tools.json.generator.types;

import at.ac.tuwien.dsg.profiles.infrastructurecpsprofile.stereotypes.pojos.*;
import at.ac.tuwien.dsg.profiles.marte.stereotypes.pojos.*;
import at.ac.tuwien.dsg.profiles.marte.enumerations.pojos.*;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.ArrayList;
import java.util.List;
import at.ac.tuwien.dsg.epsilon.tools.SampleTool;


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

		TelcoBaseTransceiverStation telcoBaseTransceiverStation = new TelcoBaseTransceiverStation();



//*************************************************
//test_configurations
//*************************************************
		//TestConfiguration test_configuration_Test001_1 = new TestConfiguration();
		//telcoBaseTransceiverStation.all_pojos.add(test_configuration_Test001_1);

//*************************************************
//Cloud Services
//*************************************************




//*************************************************
//Cloud Service BTSBroker
//*************************************************
		CloudService cloud_service_BTSBroker_1 = new CloudService();
		telcoBaseTransceiverStation.all_pojos.add(cloud_service_BTSBroker_1);
		telcoBaseTransceiverStation.all_cloud_services.add(cloud_service_BTSBroker_1);
		
		CloudServiceWrapper cloud_service_BTSBroker_1_wrapper = new CloudServiceWrapper();		
		telcoBaseTransceiverStation.all_pojos_wrapper.add(cloud_service_BTSBroker_1_wrapper);
		telcoBaseTransceiverStation.all_cloud_services_wrapper.add(cloud_service_BTSBroker_1_wrapper);
		cloud_service_BTSBroker_1_wrapper.setCloudService(cloud_service_BTSBroker_1);

		cloud_service_BTSBroker_1.addId("_YSRUIERREeeXpvCVjWTYeA");
		cloud_service_BTSBroker_1.setName("BTSBroker");	
		cloud_service_BTSBroker_1.addServiceType("VM");
		cloud_service_BTSBroker_1.addCloudProvider("");
		cloud_service_BTSBroker_1.addDataProvider("");
		cloud_service_BTSBroker_1.addComputingConfigs("GoogleComputeEngineConfig1");
		cloud_service_BTSBroker_1.addStorageConfigs("CassandraConfig1");
		cloud_service_BTSBroker_1.addStorageConfigs("GoogleBigQueryConfig1");
		cloud_service_BTSBroker_1.addCommunicationConfigs("MQTTConfigServer");

//*************************************************
//Cloud Service F1MicroMachine
//*************************************************
		CloudService cloud_service_F1MicroMachine_2 = new CloudService();
		telcoBaseTransceiverStation.all_pojos.add(cloud_service_F1MicroMachine_2);
		telcoBaseTransceiverStation.all_cloud_services.add(cloud_service_F1MicroMachine_2);
		
		CloudServiceWrapper cloud_service_F1MicroMachine_2_wrapper = new CloudServiceWrapper();		
		telcoBaseTransceiverStation.all_pojos_wrapper.add(cloud_service_F1MicroMachine_2_wrapper);
		telcoBaseTransceiverStation.all_cloud_services_wrapper.add(cloud_service_F1MicroMachine_2_wrapper);
		cloud_service_F1MicroMachine_2_wrapper.setCloudService(cloud_service_F1MicroMachine_2);

		cloud_service_F1MicroMachine_2.addId("_RcAFIEXsEeeNrMhg6pDppw");
		cloud_service_F1MicroMachine_2.setName("F1MicroMachine");	
		cloud_service_F1MicroMachine_2.addServiceType("VM");
		cloud_service_F1MicroMachine_2.addCloudProvider("");
		cloud_service_F1MicroMachine_2.addDataProvider("");

//*************************************************
//Cloud Service IngestionClient
//*************************************************
		CloudService cloud_service_IngestionClient_3 = new CloudService();
		telcoBaseTransceiverStation.all_pojos.add(cloud_service_IngestionClient_3);
		telcoBaseTransceiverStation.all_cloud_services.add(cloud_service_IngestionClient_3);
		
		CloudServiceWrapper cloud_service_IngestionClient_3_wrapper = new CloudServiceWrapper();		
		telcoBaseTransceiverStation.all_pojos_wrapper.add(cloud_service_IngestionClient_3_wrapper);
		telcoBaseTransceiverStation.all_cloud_services_wrapper.add(cloud_service_IngestionClient_3_wrapper);
		cloud_service_IngestionClient_3_wrapper.setCloudService(cloud_service_IngestionClient_3);

		cloud_service_IngestionClient_3.addId("_wgQJgE0BEeedg6nzD0_JBg");
		cloud_service_IngestionClient_3.setName("IngestionClient");	
		cloud_service_IngestionClient_3.addServiceType("VM");
		cloud_service_IngestionClient_3.addCloudProvider("");
		cloud_service_IngestionClient_3.addDataProvider("");
		cloud_service_IngestionClient_3.addComputingConfigs("GoogleComputeEngineConfig1");
		cloud_service_IngestionClient_3.addCommunicationConfigs("MQTTConfigServer");

//*************************************************
//Cloud Service BTSMonitoringDataService
//*************************************************
		CloudService cloud_service_BTSMonitoringDataService_4 = new CloudService();
		telcoBaseTransceiverStation.all_pojos.add(cloud_service_BTSMonitoringDataService_4);
		telcoBaseTransceiverStation.all_cloud_services.add(cloud_service_BTSMonitoringDataService_4);
		
		CloudServiceWrapper cloud_service_BTSMonitoringDataService_4_wrapper = new CloudServiceWrapper();		
		telcoBaseTransceiverStation.all_pojos_wrapper.add(cloud_service_BTSMonitoringDataService_4_wrapper);
		telcoBaseTransceiverStation.all_cloud_services_wrapper.add(cloud_service_BTSMonitoringDataService_4_wrapper);
		cloud_service_BTSMonitoringDataService_4_wrapper.setCloudService(cloud_service_BTSMonitoringDataService_4);

		cloud_service_BTSMonitoringDataService_4.addId("_-WXkwE0BEeedg6nzD0_JBg");
		cloud_service_BTSMonitoringDataService_4.setName("BTSMonitoringDataService");	
		cloud_service_BTSMonitoringDataService_4.addServiceType("VM");
		cloud_service_BTSMonitoringDataService_4.addCloudProvider("");
		cloud_service_BTSMonitoringDataService_4.addDataProvider("");
		cloud_service_BTSMonitoringDataService_4.addComputingConfigs("GoogleComputeEngineConfig1");
		cloud_service_BTSMonitoringDataService_4.addCommunicationConfigs("MQTTConfigServer");

//*************************************************
//Cloud Service BigQuery
//*************************************************
		CloudService cloud_service_BigQuery_5 = new CloudService();
		telcoBaseTransceiverStation.all_pojos.add(cloud_service_BigQuery_5);
		telcoBaseTransceiverStation.all_cloud_services.add(cloud_service_BigQuery_5);
		
		CloudServiceWrapper cloud_service_BigQuery_5_wrapper = new CloudServiceWrapper();		
		telcoBaseTransceiverStation.all_pojos_wrapper.add(cloud_service_BigQuery_5_wrapper);
		telcoBaseTransceiverStation.all_cloud_services_wrapper.add(cloud_service_BigQuery_5_wrapper);
		cloud_service_BigQuery_5_wrapper.setCloudService(cloud_service_BigQuery_5);

		cloud_service_BigQuery_5.addId("_6vtsAFgWEeeeTquJkarvqA");
		cloud_service_BigQuery_5.setName("BigQuery");	
		cloud_service_BigQuery_5.addServiceType("VM");
		cloud_service_BigQuery_5.addCloudProvider("");
		cloud_service_BigQuery_5.addDataProvider("");

//*************************************************
//Cloud Service MQTTBrokerLocal
//*************************************************
		CloudService cloud_service_MQTTBrokerLocal_6 = new CloudService();
		telcoBaseTransceiverStation.all_pojos.add(cloud_service_MQTTBrokerLocal_6);
		telcoBaseTransceiverStation.all_cloud_services.add(cloud_service_MQTTBrokerLocal_6);
		
		CloudServiceWrapper cloud_service_MQTTBrokerLocal_6_wrapper = new CloudServiceWrapper();		
		telcoBaseTransceiverStation.all_pojos_wrapper.add(cloud_service_MQTTBrokerLocal_6_wrapper);
		telcoBaseTransceiverStation.all_cloud_services_wrapper.add(cloud_service_MQTTBrokerLocal_6_wrapper);
		cloud_service_MQTTBrokerLocal_6_wrapper.setCloudService(cloud_service_MQTTBrokerLocal_6);

		cloud_service_MQTTBrokerLocal_6.addId("_3mxn4F12Eeel-tS9I1vO3w");
		cloud_service_MQTTBrokerLocal_6.setName("MQTTBrokerLocal");	
		cloud_service_MQTTBrokerLocal_6.addServiceType("VM");
		cloud_service_MQTTBrokerLocal_6.addCloudProvider("");
		cloud_service_MQTTBrokerLocal_6.addDataProvider("");
		cloud_service_MQTTBrokerLocal_6.addCommunicationConfigs("MQTTConfigServer");

//*************************************************
//Cloud Service MQTTBroker2Google
//*************************************************
		CloudService cloud_service_MQTTBroker2Google_7 = new CloudService();
		telcoBaseTransceiverStation.all_pojos.add(cloud_service_MQTTBroker2Google_7);
		telcoBaseTransceiverStation.all_cloud_services.add(cloud_service_MQTTBroker2Google_7);
		
		CloudServiceWrapper cloud_service_MQTTBroker2Google_7_wrapper = new CloudServiceWrapper();		
		telcoBaseTransceiverStation.all_pojos_wrapper.add(cloud_service_MQTTBroker2Google_7_wrapper);
		telcoBaseTransceiverStation.all_cloud_services_wrapper.add(cloud_service_MQTTBroker2Google_7_wrapper);
		cloud_service_MQTTBroker2Google_7_wrapper.setCloudService(cloud_service_MQTTBroker2Google_7);

		cloud_service_MQTTBroker2Google_7.addId("_I9-kQF13Eeel-tS9I1vO3w");
		cloud_service_MQTTBroker2Google_7.setName("MQTTBroker2Google");	
		cloud_service_MQTTBroker2Google_7.addServiceType("VM");
		cloud_service_MQTTBroker2Google_7.addCloudProvider("");
		cloud_service_MQTTBroker2Google_7.addDataProvider("");

//*************************************************
//Cloud Service BTSBroker1Local
//*************************************************
		CloudService cloud_service_BTSBroker1Local_8 = new CloudService();
		telcoBaseTransceiverStation.all_pojos.add(cloud_service_BTSBroker1Local_8);
		telcoBaseTransceiverStation.all_cloud_services.add(cloud_service_BTSBroker1Local_8);
		
		CloudServiceWrapper cloud_service_BTSBroker1Local_8_wrapper = new CloudServiceWrapper();		
		telcoBaseTransceiverStation.all_pojos_wrapper.add(cloud_service_BTSBroker1Local_8_wrapper);
		telcoBaseTransceiverStation.all_cloud_services_wrapper.add(cloud_service_BTSBroker1Local_8_wrapper);
		cloud_service_BTSBroker1Local_8_wrapper.setCloudService(cloud_service_BTSBroker1Local_8);

		cloud_service_BTSBroker1Local_8.addId("_vPmLUJJMEeeeSL7FBGSdJA");
		cloud_service_BTSBroker1Local_8.setName("BTSBroker1Local");	
		cloud_service_BTSBroker1Local_8.addServiceType("VM");
		cloud_service_BTSBroker1Local_8.addCloudProvider("");
		cloud_service_BTSBroker1Local_8.addDataProvider("");

//*************************************************
//Cloud Service BTSBroker2Google
//*************************************************
		CloudService cloud_service_BTSBroker2Google_9 = new CloudService();
		telcoBaseTransceiverStation.all_pojos.add(cloud_service_BTSBroker2Google_9);
		telcoBaseTransceiverStation.all_cloud_services.add(cloud_service_BTSBroker2Google_9);
		
		CloudServiceWrapper cloud_service_BTSBroker2Google_9_wrapper = new CloudServiceWrapper();		
		telcoBaseTransceiverStation.all_pojos_wrapper.add(cloud_service_BTSBroker2Google_9_wrapper);
		telcoBaseTransceiverStation.all_cloud_services_wrapper.add(cloud_service_BTSBroker2Google_9_wrapper);
		cloud_service_BTSBroker2Google_9_wrapper.setCloudService(cloud_service_BTSBroker2Google_9);

		cloud_service_BTSBroker2Google_9.addId("_CmlOIJJNEeeeSL7FBGSdJA");
		cloud_service_BTSBroker2Google_9.setName("BTSBroker2Google");	
		cloud_service_BTSBroker2Google_9.addServiceType("VM");
		cloud_service_BTSBroker2Google_9.addCloudProvider("");
		cloud_service_BTSBroker2Google_9.addDataProvider("");

//*************************************************
//Cloud Service Cassandra
//*************************************************
		CloudService cloud_service_Cassandra_10 = new CloudService();
		telcoBaseTransceiverStation.all_pojos.add(cloud_service_Cassandra_10);
		telcoBaseTransceiverStation.all_cloud_services.add(cloud_service_Cassandra_10);
		
		CloudServiceWrapper cloud_service_Cassandra_10_wrapper = new CloudServiceWrapper();		
		telcoBaseTransceiverStation.all_pojos_wrapper.add(cloud_service_Cassandra_10_wrapper);
		telcoBaseTransceiverStation.all_cloud_services_wrapper.add(cloud_service_Cassandra_10_wrapper);
		cloud_service_Cassandra_10_wrapper.setCloudService(cloud_service_Cassandra_10);

		cloud_service_Cassandra_10.addId("_6-Kj4JJPEeeeSL7FBGSdJA");
		cloud_service_Cassandra_10.setName("Cassandra");	
		cloud_service_Cassandra_10.addServiceType("VM");
		cloud_service_Cassandra_10.addCloudProvider("");
		cloud_service_Cassandra_10.addDataProvider("");

//*************************************************
//Virtual Sensors
//*************************************************




//*************************************************
//Virtual Sensor TemperatureSensor
//*************************************************
		VirtualSensor virtual_sensor_TemperatureSensor_1 = new VirtualSensor();
		telcoBaseTransceiverStation.all_pojos.add(virtual_sensor_TemperatureSensor_1);
		telcoBaseTransceiverStation.all_virtual_sensors.add(virtual_sensor_TemperatureSensor_1);

		VirtualSensorWrapper virtual_sensor_TemperatureSensor_1_wrapper= new VirtualSensorWrapper();
		telcoBaseTransceiverStation.all_pojos_wrapper.add(virtual_sensor_TemperatureSensor_1_wrapper);
		telcoBaseTransceiverStation.all_virtual_sensors_wrapper.add(virtual_sensor_TemperatureSensor_1_wrapper);

		virtual_sensor_TemperatureSensor_1_wrapper.setVirtualSensor(virtual_sensor_TemperatureSensor_1);

		virtual_sensor_TemperatureSensor_1.addId("_WqOYQERREeeXpvCVjWTYeA");
		virtual_sensor_TemperatureSensor_1.setName("TemperatureSensor");	
		virtual_sensor_TemperatureSensor_1.addSwCapabilities("getProtocol");
		virtual_sensor_TemperatureSensor_1.addSwCapabilities("getRate");
		virtual_sensor_TemperatureSensor_1.addSwCapabilities("setProtocol");
		virtual_sensor_TemperatureSensor_1.addSwCapabilities("setRate");
		virtual_sensor_TemperatureSensor_1.addLocation("this is the location");
		virtual_sensor_TemperatureSensor_1.addDescription("this is the description");
		virtual_sensor_TemperatureSensor_1.addHasTimestampMechanism("false");
		virtual_sensor_TemperatureSensor_1.addTimestampMaxLatency("string value for the latency");



//*************************************************
//Virtual Sensor ElectricitySensor
//*************************************************
		VirtualSensor virtual_sensor_ElectricitySensor_2 = new VirtualSensor();
		telcoBaseTransceiverStation.all_pojos.add(virtual_sensor_ElectricitySensor_2);
		telcoBaseTransceiverStation.all_virtual_sensors.add(virtual_sensor_ElectricitySensor_2);

		VirtualSensorWrapper virtual_sensor_ElectricitySensor_2_wrapper= new VirtualSensorWrapper();
		telcoBaseTransceiverStation.all_pojos_wrapper.add(virtual_sensor_ElectricitySensor_2_wrapper);
		telcoBaseTransceiverStation.all_virtual_sensors_wrapper.add(virtual_sensor_ElectricitySensor_2_wrapper);

		virtual_sensor_ElectricitySensor_2_wrapper.setVirtualSensor(virtual_sensor_ElectricitySensor_2);

		virtual_sensor_ElectricitySensor_2.addId("_TonUQEUIEeebuPNq01--pQ");
		virtual_sensor_ElectricitySensor_2.setName("ElectricitySensor");	
		virtual_sensor_ElectricitySensor_2.addSwCapabilities("setRate");
		virtual_sensor_ElectricitySensor_2.addSwCapabilities("getRate");
		virtual_sensor_ElectricitySensor_2.addSwCapabilities("setProtocol");
		virtual_sensor_ElectricitySensor_2.addSwCapabilities("getProtocol");
		virtual_sensor_ElectricitySensor_2.addLocation("string value for location");
		virtual_sensor_ElectricitySensor_2.addDescription("string value for the description");
		virtual_sensor_ElectricitySensor_2.addHasTimestampMechanism("false");
		virtual_sensor_ElectricitySensor_2.addTimestampMaxLatency("");



//*************************************************
//Virtual Sensor AirConditioningSensor
//*************************************************
		VirtualSensor virtual_sensor_AirConditioningSensor_3 = new VirtualSensor();
		telcoBaseTransceiverStation.all_pojos.add(virtual_sensor_AirConditioningSensor_3);
		telcoBaseTransceiverStation.all_virtual_sensors.add(virtual_sensor_AirConditioningSensor_3);

		VirtualSensorWrapper virtual_sensor_AirConditioningSensor_3_wrapper= new VirtualSensorWrapper();
		telcoBaseTransceiverStation.all_pojos_wrapper.add(virtual_sensor_AirConditioningSensor_3_wrapper);
		telcoBaseTransceiverStation.all_virtual_sensors_wrapper.add(virtual_sensor_AirConditioningSensor_3_wrapper);

		virtual_sensor_AirConditioningSensor_3_wrapper.setVirtualSensor(virtual_sensor_AirConditioningSensor_3);

		virtual_sensor_AirConditioningSensor_3.addId("_Hxgt8EUJEeebuPNq01--pQ");
		virtual_sensor_AirConditioningSensor_3.setName("AirConditioningSensor");	
		virtual_sensor_AirConditioningSensor_3.addSwCapabilities("getProtocol");
		virtual_sensor_AirConditioningSensor_3.addSwCapabilities("getRate");
		virtual_sensor_AirConditioningSensor_3.addSwCapabilities("setProtocol");
		virtual_sensor_AirConditioningSensor_3.addSwCapabilities("setRate");
		virtual_sensor_AirConditioningSensor_3.addLocation("string value for the location");
		virtual_sensor_AirConditioningSensor_3.addDescription("string value for the description");
		virtual_sensor_AirConditioningSensor_3.addHasTimestampMechanism("false");
		virtual_sensor_AirConditioningSensor_3.addTimestampMaxLatency("");



//*************************************************
//Virtual Sensor TemperatureSensor1
//*************************************************
		VirtualSensor virtual_sensor_TemperatureSensor1_4 = new VirtualSensor();
		telcoBaseTransceiverStation.all_pojos.add(virtual_sensor_TemperatureSensor1_4);
		telcoBaseTransceiverStation.all_virtual_sensors.add(virtual_sensor_TemperatureSensor1_4);

		VirtualSensorWrapper virtual_sensor_TemperatureSensor1_4_wrapper= new VirtualSensorWrapper();
		telcoBaseTransceiverStation.all_pojos_wrapper.add(virtual_sensor_TemperatureSensor1_4_wrapper);
		telcoBaseTransceiverStation.all_virtual_sensors_wrapper.add(virtual_sensor_TemperatureSensor1_4_wrapper);

		virtual_sensor_TemperatureSensor1_4_wrapper.setVirtualSensor(virtual_sensor_TemperatureSensor1_4);

		virtual_sensor_TemperatureSensor1_4.addId("_vz9ukJJKEeeeSL7FBGSdJA");
		virtual_sensor_TemperatureSensor1_4.setName("TemperatureSensor1");	
		virtual_sensor_TemperatureSensor1_4.addLocation("");
		virtual_sensor_TemperatureSensor1_4.addDescription("");
		virtual_sensor_TemperatureSensor1_4.addHasTimestampMechanism("false");
		virtual_sensor_TemperatureSensor1_4.addTimestampMaxLatency("");



//*************************************************
//Virtual Sensor ElectricitySensor1
//*************************************************
		VirtualSensor virtual_sensor_ElectricitySensor1_5 = new VirtualSensor();
		telcoBaseTransceiverStation.all_pojos.add(virtual_sensor_ElectricitySensor1_5);
		telcoBaseTransceiverStation.all_virtual_sensors.add(virtual_sensor_ElectricitySensor1_5);

		VirtualSensorWrapper virtual_sensor_ElectricitySensor1_5_wrapper= new VirtualSensorWrapper();
		telcoBaseTransceiverStation.all_pojos_wrapper.add(virtual_sensor_ElectricitySensor1_5_wrapper);
		telcoBaseTransceiverStation.all_virtual_sensors_wrapper.add(virtual_sensor_ElectricitySensor1_5_wrapper);

		virtual_sensor_ElectricitySensor1_5_wrapper.setVirtualSensor(virtual_sensor_ElectricitySensor1_5);

		virtual_sensor_ElectricitySensor1_5.addId("_7dxDQJJKEeeeSL7FBGSdJA");
		virtual_sensor_ElectricitySensor1_5.setName("ElectricitySensor1");	
		virtual_sensor_ElectricitySensor1_5.addLocation("");
		virtual_sensor_ElectricitySensor1_5.addDescription("");
		virtual_sensor_ElectricitySensor1_5.addHasTimestampMechanism("false");
		virtual_sensor_ElectricitySensor1_5.addTimestampMaxLatency("");



//*************************************************
//Virtual Sensor AirConditioningSensor1
//*************************************************
		VirtualSensor virtual_sensor_AirConditioningSensor1_6 = new VirtualSensor();
		telcoBaseTransceiverStation.all_pojos.add(virtual_sensor_AirConditioningSensor1_6);
		telcoBaseTransceiverStation.all_virtual_sensors.add(virtual_sensor_AirConditioningSensor1_6);

		VirtualSensorWrapper virtual_sensor_AirConditioningSensor1_6_wrapper= new VirtualSensorWrapper();
		telcoBaseTransceiverStation.all_pojos_wrapper.add(virtual_sensor_AirConditioningSensor1_6_wrapper);
		telcoBaseTransceiverStation.all_virtual_sensors_wrapper.add(virtual_sensor_AirConditioningSensor1_6_wrapper);

		virtual_sensor_AirConditioningSensor1_6_wrapper.setVirtualSensor(virtual_sensor_AirConditioningSensor1_6);

		virtual_sensor_AirConditioningSensor1_6.addId("_8jQrsJJKEeeeSL7FBGSdJA");
		virtual_sensor_AirConditioningSensor1_6.setName("AirConditioningSensor1");	
		virtual_sensor_AirConditioningSensor1_6.addLocation("");
		virtual_sensor_AirConditioningSensor1_6.addDescription("");
		virtual_sensor_AirConditioningSensor1_6.addHasTimestampMechanism("false");
		virtual_sensor_AirConditioningSensor1_6.addTimestampMaxLatency("");




//*************************************************
//Virtual Gateways
//*************************************************




//*************************************************
//Virtual Gateway IoTGateway
//*************************************************
		VirtualGateway virtual_gateway_IoTGateway_1 = new VirtualGateway();
		telcoBaseTransceiverStation.all_pojos.add(virtual_gateway_IoTGateway_1);
		telcoBaseTransceiverStation.all_virtual_gateways.add(virtual_gateway_IoTGateway_1);

		VirtualGatewayWrapper virtual_gateway_IoTGateway_1_wrapper = new VirtualGatewayWrapper();
		telcoBaseTransceiverStation.all_pojos_wrapper.add(virtual_gateway_IoTGateway_1_wrapper);
		telcoBaseTransceiverStation.all_virtual_gateways_wrapper.add(virtual_gateway_IoTGateway_1_wrapper);

		virtual_gateway_IoTGateway_1_wrapper.setVirtualGateway(virtual_gateway_IoTGateway_1);

		virtual_gateway_IoTGateway_1.addId("_plYu0EReEeeXpvCVjWTYeA");
		virtual_gateway_IoTGateway_1.setName("IoTGateway");	
		virtual_gateway_IoTGateway_1.addLocation("");
		virtual_gateway_IoTGateway_1.addDescription("");
		virtual_gateway_IoTGateway_1.addHasTimestampMechanism("false");
		virtual_gateway_IoTGateway_1.addTimestampMaxLatency("");



//*************************************************
//Virtual Gateway IoTGateway1
//*************************************************
		VirtualGateway virtual_gateway_IoTGateway1_2 = new VirtualGateway();
		telcoBaseTransceiverStation.all_pojos.add(virtual_gateway_IoTGateway1_2);
		telcoBaseTransceiverStation.all_virtual_gateways.add(virtual_gateway_IoTGateway1_2);

		VirtualGatewayWrapper virtual_gateway_IoTGateway1_2_wrapper = new VirtualGatewayWrapper();
		telcoBaseTransceiverStation.all_pojos_wrapper.add(virtual_gateway_IoTGateway1_2_wrapper);
		telcoBaseTransceiverStation.all_virtual_gateways_wrapper.add(virtual_gateway_IoTGateway1_2_wrapper);

		virtual_gateway_IoTGateway1_2_wrapper.setVirtualGateway(virtual_gateway_IoTGateway1_2);

		virtual_gateway_IoTGateway1_2.addId("_Jf79gJJLEeeeSL7FBGSdJA");
		virtual_gateway_IoTGateway1_2.setName("IoTGateway1");	
		virtual_gateway_IoTGateway1_2.addLocation("");
		virtual_gateway_IoTGateway1_2.addDescription("");
		virtual_gateway_IoTGateway1_2.addHasTimestampMechanism("false");
		virtual_gateway_IoTGateway1_2.addTimestampMaxLatency("");




//*************************************************
//Sensor HwTemperatureSensor
//*************************************************
		Sensor sensor_HwTemperatureSensor_1 = new Sensor();
		telcoBaseTransceiverStation.all_pojos.add(sensor_HwTemperatureSensor_1);
		telcoBaseTransceiverStation.all_sensors.add(sensor_HwTemperatureSensor_1);

		SensorWrapper sensor_HwTemperatureSensor_1_wrapper = new SensorWrapper();
		telcoBaseTransceiverStation.all_pojos_wrapper.add(sensor_HwTemperatureSensor_1_wrapper);
		telcoBaseTransceiverStation.all_sensors_wrapper.add(sensor_HwTemperatureSensor_1_wrapper);

		sensor_HwTemperatureSensor_1_wrapper.setSensor(sensor_HwTemperatureSensor_1);
		sensor_HwTemperatureSensor_1.addId("_2GTaEERQEeeXpvCVjWTYeA");
		sensor_HwTemperatureSensor_1.setName("HwTemperatureSensor");	
		sensor_HwTemperatureSensor_1.addLocation("");
		sensor_HwTemperatureSensor_1.addDescription("");
		sensor_HwTemperatureSensor_1.addHasTimestampMechanism("false");
		sensor_HwTemperatureSensor_1.addTimestampMaxLatency("");



//*************************************************
//Sensor HwElectricitySensor
//*************************************************
		Sensor sensor_HwElectricitySensor_2 = new Sensor();
		telcoBaseTransceiverStation.all_pojos.add(sensor_HwElectricitySensor_2);
		telcoBaseTransceiverStation.all_sensors.add(sensor_HwElectricitySensor_2);

		SensorWrapper sensor_HwElectricitySensor_2_wrapper = new SensorWrapper();
		telcoBaseTransceiverStation.all_pojos_wrapper.add(sensor_HwElectricitySensor_2_wrapper);
		telcoBaseTransceiverStation.all_sensors_wrapper.add(sensor_HwElectricitySensor_2_wrapper);

		sensor_HwElectricitySensor_2_wrapper.setSensor(sensor_HwElectricitySensor_2);
		sensor_HwElectricitySensor_2.addId("_Ucis0EReEeeXpvCVjWTYeA");
		sensor_HwElectricitySensor_2.setName("HwElectricitySensor");	
		sensor_HwElectricitySensor_2.addLocation("");
		sensor_HwElectricitySensor_2.addDescription("");
		sensor_HwElectricitySensor_2.addHasTimestampMechanism("false");
		sensor_HwElectricitySensor_2.addTimestampMaxLatency("");



//*************************************************
//Sensor HwAirConditioningSensor
//*************************************************
		Sensor sensor_HwAirConditioningSensor_3 = new Sensor();
		telcoBaseTransceiverStation.all_pojos.add(sensor_HwAirConditioningSensor_3);
		telcoBaseTransceiverStation.all_sensors.add(sensor_HwAirConditioningSensor_3);

		SensorWrapper sensor_HwAirConditioningSensor_3_wrapper = new SensorWrapper();
		telcoBaseTransceiverStation.all_pojos_wrapper.add(sensor_HwAirConditioningSensor_3_wrapper);
		telcoBaseTransceiverStation.all_sensors_wrapper.add(sensor_HwAirConditioningSensor_3_wrapper);

		sensor_HwAirConditioningSensor_3_wrapper.setSensor(sensor_HwAirConditioningSensor_3);
		sensor_HwAirConditioningSensor_3.addId("_iSyq8EReEeeXpvCVjWTYeA");
		sensor_HwAirConditioningSensor_3.setName("HwAirConditioningSensor");	
		sensor_HwAirConditioningSensor_3.addLocation("");
		sensor_HwAirConditioningSensor_3.addDescription("");
		sensor_HwAirConditioningSensor_3.addHasTimestampMechanism("false");
		sensor_HwAirConditioningSensor_3.addTimestampMaxLatency("");



//*************************************************
//Sensor HardwareElectricitySensor1
//*************************************************
		Sensor sensor_HardwareElectricitySensor1_4 = new Sensor();
		telcoBaseTransceiverStation.all_pojos.add(sensor_HardwareElectricitySensor1_4);
		telcoBaseTransceiverStation.all_sensors.add(sensor_HardwareElectricitySensor1_4);

		SensorWrapper sensor_HardwareElectricitySensor1_4_wrapper = new SensorWrapper();
		telcoBaseTransceiverStation.all_pojos_wrapper.add(sensor_HardwareElectricitySensor1_4_wrapper);
		telcoBaseTransceiverStation.all_sensors_wrapper.add(sensor_HardwareElectricitySensor1_4_wrapper);

		sensor_HardwareElectricitySensor1_4_wrapper.setSensor(sensor_HardwareElectricitySensor1_4);
		sensor_HardwareElectricitySensor1_4.addId("_KJNukJJMEeeeSL7FBGSdJA");
		sensor_HardwareElectricitySensor1_4.setName("HardwareElectricitySensor1");	
		sensor_HardwareElectricitySensor1_4.addLocation("");
		sensor_HardwareElectricitySensor1_4.addDescription("");
		sensor_HardwareElectricitySensor1_4.addHasTimestampMechanism("false");
		sensor_HardwareElectricitySensor1_4.addTimestampMaxLatency("");



//*************************************************
//Sensor HwAirConditioningSensor1
//*************************************************
		Sensor sensor_HwAirConditioningSensor1_5 = new Sensor();
		telcoBaseTransceiverStation.all_pojos.add(sensor_HwAirConditioningSensor1_5);
		telcoBaseTransceiverStation.all_sensors.add(sensor_HwAirConditioningSensor1_5);

		SensorWrapper sensor_HwAirConditioningSensor1_5_wrapper = new SensorWrapper();
		telcoBaseTransceiverStation.all_pojos_wrapper.add(sensor_HwAirConditioningSensor1_5_wrapper);
		telcoBaseTransceiverStation.all_sensors_wrapper.add(sensor_HwAirConditioningSensor1_5_wrapper);

		sensor_HwAirConditioningSensor1_5_wrapper.setSensor(sensor_HwAirConditioningSensor1_5);
		sensor_HwAirConditioningSensor1_5.addId("_UCjyQJJMEeeeSL7FBGSdJA");
		sensor_HwAirConditioningSensor1_5.setName("HwAirConditioningSensor1");	
		sensor_HwAirConditioningSensor1_5.addLocation("");
		sensor_HwAirConditioningSensor1_5.addDescription("");
		sensor_HwAirConditioningSensor1_5.addHasTimestampMechanism("false");
		sensor_HwAirConditioningSensor1_5.addTimestampMaxLatency("");



//*************************************************
//Sensor HwTemperatureSensor1
//*************************************************
		Sensor sensor_HwTemperatureSensor1_6 = new Sensor();
		telcoBaseTransceiverStation.all_pojos.add(sensor_HwTemperatureSensor1_6);
		telcoBaseTransceiverStation.all_sensors.add(sensor_HwTemperatureSensor1_6);

		SensorWrapper sensor_HwTemperatureSensor1_6_wrapper = new SensorWrapper();
		telcoBaseTransceiverStation.all_pojos_wrapper.add(sensor_HwTemperatureSensor1_6_wrapper);
		telcoBaseTransceiverStation.all_sensors_wrapper.add(sensor_HwTemperatureSensor1_6_wrapper);

		sensor_HwTemperatureSensor1_6_wrapper.setSensor(sensor_HwTemperatureSensor1_6);
		sensor_HwTemperatureSensor1_6.addId("_VUWxUJJMEeeeSL7FBGSdJA");
		sensor_HwTemperatureSensor1_6.setName("HwTemperatureSensor1");	
		sensor_HwTemperatureSensor1_6.addLocation("");
		sensor_HwTemperatureSensor1_6.addDescription("");
		sensor_HwTemperatureSensor1_6.addHasTimestampMechanism("false");
		sensor_HwTemperatureSensor1_6.addTimestampMaxLatency("");


    

//*************************************************
//Virtual Actuators
//*************************************************




//*************************************************
//Communications
//*************************************************




//*************************************************
//Communication BTSBroker_IngestionClient
//*************************************************
		Communication communication_BTSBroker_IngestionClient_1 = new Communication();
		telcoBaseTransceiverStation.all_pojos.add(communication_BTSBroker_IngestionClient_1);
		telcoBaseTransceiverStation.all_communications.add(communication_BTSBroker_IngestionClient_1);

		CommunicationWrapper communication_BTSBroker_IngestionClient_1_wrapper = new CommunicationWrapper();
		telcoBaseTransceiverStation.all_pojos_wrapper.add(communication_BTSBroker_IngestionClient_1_wrapper);
		telcoBaseTransceiverStation.all_communications_wrapper.add(communication_BTSBroker_IngestionClient_1_wrapper);
		communication_BTSBroker_IngestionClient_1.addId("_XclXYERTEeeXpvCVjWTYeA");
		communication_BTSBroker_IngestionClient_1.setName("BTSBroker_IngestionClient");	
		communication_BTSBroker_IngestionClient_1.addCommunicationConfigs("MQTTConfigServer");
		communication_BTSBroker_IngestionClient_1.addLocation("");
		communication_BTSBroker_IngestionClient_1.addDescription("");
		communication_BTSBroker_IngestionClient_1.addHasTimestampMechanism("false");
		communication_BTSBroker_IngestionClient_1.addTimestampMaxLatency("");
		communication_BTSBroker_IngestionClient_1.addConnectionEnds("IngestionClient");
		communication_BTSBroker_IngestionClient_1.addConnectionEnds("BTSBroker");



//*************************************************
//Communication BTSBroker_IotGateway
//*************************************************
		Communication communication_BTSBroker_IotGateway_2 = new Communication();
		telcoBaseTransceiverStation.all_pojos.add(communication_BTSBroker_IotGateway_2);
		telcoBaseTransceiverStation.all_communications.add(communication_BTSBroker_IotGateway_2);

		CommunicationWrapper communication_BTSBroker_IotGateway_2_wrapper = new CommunicationWrapper();
		telcoBaseTransceiverStation.all_pojos_wrapper.add(communication_BTSBroker_IotGateway_2_wrapper);
		telcoBaseTransceiverStation.all_communications_wrapper.add(communication_BTSBroker_IotGateway_2_wrapper);
		communication_BTSBroker_IotGateway_2.addId("_hrIz0EUIEeebuPNq01--pQ");
		communication_BTSBroker_IotGateway_2.setName("BTSBroker_IotGateway");	
		communication_BTSBroker_IotGateway_2.addCommunicationConfigs("MQTTConfigServer");
		communication_BTSBroker_IotGateway_2.addLocation("");
		communication_BTSBroker_IotGateway_2.addDescription("");
		communication_BTSBroker_IotGateway_2.addHasTimestampMechanism("false");
		communication_BTSBroker_IotGateway_2.addTimestampMaxLatency("");
		communication_BTSBroker_IotGateway_2.addConnectionEnds("IoTGateway");
		communication_BTSBroker_IotGateway_2.addConnectionEnds("BTSBroker");



//*************************************************
//Communication IoTGateway_TemperatureSensor
//*************************************************
		Communication communication_IoTGateway_TemperatureSensor_3 = new Communication();
		telcoBaseTransceiverStation.all_pojos.add(communication_IoTGateway_TemperatureSensor_3);
		telcoBaseTransceiverStation.all_communications.add(communication_IoTGateway_TemperatureSensor_3);

		CommunicationWrapper communication_IoTGateway_TemperatureSensor_3_wrapper = new CommunicationWrapper();
		telcoBaseTransceiverStation.all_pojos_wrapper.add(communication_IoTGateway_TemperatureSensor_3_wrapper);
		telcoBaseTransceiverStation.all_communications_wrapper.add(communication_IoTGateway_TemperatureSensor_3_wrapper);
		communication_IoTGateway_TemperatureSensor_3.addId("_pOepcEUIEeebuPNq01--pQ");
		communication_IoTGateway_TemperatureSensor_3.setName("IoTGateway_TemperatureSensor");	
		communication_IoTGateway_TemperatureSensor_3.addCommunicationConfigs("MQTTConfigServer");
		communication_IoTGateway_TemperatureSensor_3.addLocation("");
		communication_IoTGateway_TemperatureSensor_3.addDescription("");
		communication_IoTGateway_TemperatureSensor_3.addHasTimestampMechanism("false");
		communication_IoTGateway_TemperatureSensor_3.addTimestampMaxLatency("");
		communication_IoTGateway_TemperatureSensor_3.addConnectionEnds("TemperatureSensor");
		communication_IoTGateway_TemperatureSensor_3.addConnectionEnds("IoTGateway");



//*************************************************
//Communication CommElectricitySensorIoTGateway1
//*************************************************
		Communication communication_CommElectricitySensorIoTGateway1_4 = new Communication();
		telcoBaseTransceiverStation.all_pojos.add(communication_CommElectricitySensorIoTGateway1_4);
		telcoBaseTransceiverStation.all_communications.add(communication_CommElectricitySensorIoTGateway1_4);

		CommunicationWrapper communication_CommElectricitySensorIoTGateway1_4_wrapper = new CommunicationWrapper();
		telcoBaseTransceiverStation.all_pojos_wrapper.add(communication_CommElectricitySensorIoTGateway1_4_wrapper);
		telcoBaseTransceiverStation.all_communications_wrapper.add(communication_CommElectricitySensorIoTGateway1_4_wrapper);
		communication_CommElectricitySensorIoTGateway1_4.addId("_wuSp8EUIEeebuPNq01--pQ");
		communication_CommElectricitySensorIoTGateway1_4.setName("CommElectricitySensorIoTGateway1");	
		communication_CommElectricitySensorIoTGateway1_4.addCommunicationConfigs("MQTTConfigClient");
		communication_CommElectricitySensorIoTGateway1_4.addLocation("");
		communication_CommElectricitySensorIoTGateway1_4.addDescription("");
		communication_CommElectricitySensorIoTGateway1_4.addHasTimestampMechanism("false");
		communication_CommElectricitySensorIoTGateway1_4.addTimestampMaxLatency("");
		communication_CommElectricitySensorIoTGateway1_4.addConnectionEnds("ElectricitySensor");
		communication_CommElectricitySensorIoTGateway1_4.addConnectionEnds("IoTGateway");



//*************************************************
//Communication IoTGateway_AirConditioningSensor
//*************************************************
		Communication communication_IoTGateway_AirConditioningSensor_5 = new Communication();
		telcoBaseTransceiverStation.all_pojos.add(communication_IoTGateway_AirConditioningSensor_5);
		telcoBaseTransceiverStation.all_communications.add(communication_IoTGateway_AirConditioningSensor_5);

		CommunicationWrapper communication_IoTGateway_AirConditioningSensor_5_wrapper = new CommunicationWrapper();
		telcoBaseTransceiverStation.all_pojos_wrapper.add(communication_IoTGateway_AirConditioningSensor_5_wrapper);
		telcoBaseTransceiverStation.all_communications_wrapper.add(communication_IoTGateway_AirConditioningSensor_5_wrapper);
		communication_IoTGateway_AirConditioningSensor_5.addId("_N0eV8EUJEeebuPNq01--pQ");
		communication_IoTGateway_AirConditioningSensor_5.setName("IoTGateway_AirConditioningSensor");	
		communication_IoTGateway_AirConditioningSensor_5.addCommunicationConfigs("MQTTConfigServer");
		communication_IoTGateway_AirConditioningSensor_5.addLocation("");
		communication_IoTGateway_AirConditioningSensor_5.addDescription("");
		communication_IoTGateway_AirConditioningSensor_5.addHasTimestampMechanism("false");
		communication_IoTGateway_AirConditioningSensor_5.addTimestampMaxLatency("");
		communication_IoTGateway_AirConditioningSensor_5.addConnectionEnds("AirConditioningSensor");
		communication_IoTGateway_AirConditioningSensor_5.addConnectionEnds("IoTGateway");



//*************************************************
//Communication IngestionClient_BTSMonitoringDataService
//*************************************************
		Communication communication_IngestionClient_BTSMonitoringDataService_6 = new Communication();
		telcoBaseTransceiverStation.all_pojos.add(communication_IngestionClient_BTSMonitoringDataService_6);
		telcoBaseTransceiverStation.all_communications.add(communication_IngestionClient_BTSMonitoringDataService_6);

		CommunicationWrapper communication_IngestionClient_BTSMonitoringDataService_6_wrapper = new CommunicationWrapper();
		telcoBaseTransceiverStation.all_pojos_wrapper.add(communication_IngestionClient_BTSMonitoringDataService_6_wrapper);
		telcoBaseTransceiverStation.all_communications_wrapper.add(communication_IngestionClient_BTSMonitoringDataService_6_wrapper);
		communication_IngestionClient_BTSMonitoringDataService_6.addId("_Eu1isE0CEeedg6nzD0_JBg");
		communication_IngestionClient_BTSMonitoringDataService_6.setName("IngestionClient_BTSMonitoringDataService");	
		communication_IngestionClient_BTSMonitoringDataService_6.addCommunicationConfigs("MQTTConfigServer");
		communication_IngestionClient_BTSMonitoringDataService_6.addLocation("");
		communication_IngestionClient_BTSMonitoringDataService_6.addDescription("");
		communication_IngestionClient_BTSMonitoringDataService_6.addHasTimestampMechanism("false");
		communication_IngestionClient_BTSMonitoringDataService_6.addTimestampMaxLatency("");
		communication_IngestionClient_BTSMonitoringDataService_6.addConnectionEnds("BTSMonitoringDataService");
		communication_IngestionClient_BTSMonitoringDataService_6.addConnectionEnds("IngestionClient");




//*************************************************
//communication_configurations
//*************************************************

//*************************************************
//Communication Configuration MQTTConfigServer
//*************************************************
		CommunicationConfiguration communication_configuration_MQTTConfigServer_1 = new CommunicationConfiguration();
		telcoBaseTransceiverStation.all_pojos.add(communication_configuration_MQTTConfigServer_1);
		telcoBaseTransceiverStation.all_communication_configurations.add(communication_configuration_MQTTConfigServer_1);

		CommunicationConfigurationWrapper communication_configuration_MQTTConfigServer_1_wrapper = new CommunicationConfigurationWrapper();
		telcoBaseTransceiverStation.all_pojos_wrapper.add(communication_configuration_MQTTConfigServer_1_wrapper);
		telcoBaseTransceiverStation.all_communication_configurations_wrapper.add(communication_configuration_MQTTConfigServer_1_wrapper);

		communication_configuration_MQTTConfigServer_1.addId("_8V-5EEdpEee5F8b1qsyZMA");
		communication_configuration_MQTTConfigServer_1.setName("MQTTConfigServer");	
		communication_configuration_MQTTConfigServer_1.addProtocolType("MQTT");
		communication_configuration_MQTTConfigServer_1.addClientID("Jolla");
		communication_configuration_MQTTConfigServer_1.addPortNumber("1883");
		communication_configuration_MQTTConfigServer_1.addServerIP("192.168.11.11");
		communication_configuration_MQTTConfigServer_1.addTopics("topic001");
		communication_configuration_MQTTConfigServer_1.addTopics("topic002");
		communication_configuration_MQTTConfigServer_1.addQosLevel("");
		communication_configuration_MQTTConfigServer_1.addKeepAlive("210");



//*************************************************
//Communication Configuration MQTTConfigClient
//*************************************************
		CommunicationConfiguration communication_configuration_MQTTConfigClient_2 = new CommunicationConfiguration();
		telcoBaseTransceiverStation.all_pojos.add(communication_configuration_MQTTConfigClient_2);
		telcoBaseTransceiverStation.all_communication_configurations.add(communication_configuration_MQTTConfigClient_2);

		CommunicationConfigurationWrapper communication_configuration_MQTTConfigClient_2_wrapper = new CommunicationConfigurationWrapper();
		telcoBaseTransceiverStation.all_pojos_wrapper.add(communication_configuration_MQTTConfigClient_2_wrapper);
		telcoBaseTransceiverStation.all_communication_configurations_wrapper.add(communication_configuration_MQTTConfigClient_2_wrapper);

		communication_configuration_MQTTConfigClient_2.addId("_U4jccEqKEeemwObUvM0ZZA");
		communication_configuration_MQTTConfigClient_2.setName("MQTTConfigClient");	
		communication_configuration_MQTTConfigClient_2.addProtocolType("MQTT");
		communication_configuration_MQTTConfigClient_2.addClientID("");
		communication_configuration_MQTTConfigClient_2.addPortNumber("1883");
		communication_configuration_MQTTConfigClient_2.addServerIP("35.189.187.208");
		communication_configuration_MQTTConfigClient_2.addTopics("gateway/electricity");
		communication_configuration_MQTTConfigClient_2.addQosLevel("2");
		communication_configuration_MQTTConfigClient_2.addKeepAlive("undef");





//*************************************************
//computing_configurations
//*************************************************

//*************************************************
//Computing Configuration GoogleComputeEngineConfig1
//*************************************************
		ComputingConfiguration computing_configuration_GoogleComputeEngineConfig1_1 = new ComputingConfiguration();
		telcoBaseTransceiverStation.all_pojos.add(computing_configuration_GoogleComputeEngineConfig1_1);
		telcoBaseTransceiverStation.all_computing_configurations.add(computing_configuration_GoogleComputeEngineConfig1_1);

		ComputingConfigurationWrapper computing_configuration_GoogleComputeEngineConfig1_1_wrapper = new ComputingConfigurationWrapper();
		telcoBaseTransceiverStation.all_pojos_wrapper.add(computing_configuration_GoogleComputeEngineConfig1_1_wrapper);
		telcoBaseTransceiverStation.all_computing_configurations_wrapper.add(computing_configuration_GoogleComputeEngineConfig1_1_wrapper);

		computing_configuration_GoogleComputeEngineConfig1_1.addId("_TKc1YFDsEeeBaKpUcWLICA");
		computing_configuration_GoogleComputeEngineConfig1_1.setName("GoogleComputeEngineConfig1");	



//*************************************************
//Computing Configuration CassandraComputingConfiguration1
//*************************************************
		ComputingConfiguration computing_configuration_CassandraComputingConfiguration1_2 = new ComputingConfiguration();
		telcoBaseTransceiverStation.all_pojos.add(computing_configuration_CassandraComputingConfiguration1_2);
		telcoBaseTransceiverStation.all_computing_configurations.add(computing_configuration_CassandraComputingConfiguration1_2);

		ComputingConfigurationWrapper computing_configuration_CassandraComputingConfiguration1_2_wrapper = new ComputingConfigurationWrapper();
		telcoBaseTransceiverStation.all_pojos_wrapper.add(computing_configuration_CassandraComputingConfiguration1_2_wrapper);
		telcoBaseTransceiverStation.all_computing_configurations_wrapper.add(computing_configuration_CassandraComputingConfiguration1_2_wrapper);

		computing_configuration_CassandraComputingConfiguration1_2.addId("_Jwm4UFgXEeeeTquJkarvqA");
		computing_configuration_CassandraComputingConfiguration1_2.setName("CassandraComputingConfiguration1");	




//*************************************************
//storage_configurations
//*************************************************

//*************************************************
//Storage Configuration CassandraConfig1
//*************************************************
		StorageConfiguration storage_configuration_CassandraConfig1_1 = new StorageConfiguration();
		telcoBaseTransceiverStation.all_pojos.add(storage_configuration_CassandraConfig1_1);
		telcoBaseTransceiverStation.all_storage_configurations.add(storage_configuration_CassandraConfig1_1);

		StorageConfigurationWrapper storage_configuration_CassandraConfig1_1_wrapper = new StorageConfigurationWrapper();
		telcoBaseTransceiverStation.all_pojos_wrapper.add(storage_configuration_CassandraConfig1_1_wrapper);
		telcoBaseTransceiverStation.all_storage_configurations_wrapper.add(storage_configuration_CassandraConfig1_1_wrapper);

		storage_configuration_CassandraConfig1_1.addId("_YFToIE0CEeedg6nzD0_JBg");
		storage_configuration_CassandraConfig1_1.setName("CassandraConfig1");	


//*************************************************
//Storage Configuration GoogleBigQueryConfig1
//*************************************************
		StorageConfiguration storage_configuration_GoogleBigQueryConfig1_2 = new StorageConfiguration();
		telcoBaseTransceiverStation.all_pojos.add(storage_configuration_GoogleBigQueryConfig1_2);
		telcoBaseTransceiverStation.all_storage_configurations.add(storage_configuration_GoogleBigQueryConfig1_2);

		StorageConfigurationWrapper storage_configuration_GoogleBigQueryConfig1_2_wrapper = new StorageConfigurationWrapper();
		telcoBaseTransceiverStation.all_pojos_wrapper.add(storage_configuration_GoogleBigQueryConfig1_2_wrapper);
		telcoBaseTransceiverStation.all_storage_configurations_wrapper.add(storage_configuration_GoogleBigQueryConfig1_2_wrapper);

		storage_configuration_GoogleBigQueryConfig1_2.addId("_airpgE0CEeedg6nzD0_JBg");
		storage_configuration_GoogleBigQueryConfig1_2.setName("GoogleBigQueryConfig1");	


	    Gson gson = new GsonBuilder().setPrettyPrinting().create();
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
		System.out.println(output);
		
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
		System.out.println(output_wrapper);
	
	}
}
