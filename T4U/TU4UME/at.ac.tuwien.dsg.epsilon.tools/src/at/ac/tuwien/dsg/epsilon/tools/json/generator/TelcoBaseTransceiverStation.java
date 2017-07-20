
package at.ac.tuwien.dsg.epsilon.tools.json.generator;

//*************************************************
// Version 0.1
// Authors: Luca Berardinelli, TU Wien, https://www.linkedin.com/in/lucaberardinelli/
// Date: 17.07.2017
// Description: 
// JAVA Main Program that builds a JAVA object representation of a 
// IoT Clound infrastructure architecture from a given UML Model.
// This file is the result of a model to text transformation implemented in Eclipse EPSILON framework 
// (EPSILON Generation Language).
// The JAVA object representation is then serialized in JSON usin the Google GSON library.
// The output is currently printed on system console.
//*************************************************


import at.ac.tuwien.dsg.profiles.cpsinfrastructure.stereotypes.pojos.*;
import at.ac.tuwien.dsg.profiles.cpsinfrastructure.enumerations.pojos.*;


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
	private List<Object> all_cloud_services = new ArrayList<Object>();


	public static void main(String[] args) {

		TelcoBaseTransceiverStation telcoBaseTransceiverStation = new TelcoBaseTransceiverStation();



//*************************************************
//test_configurations
//*************************************************
		//TestConfiguration test_configuration_Test001_1 = new TestConfiguration();
		//telcoBaseTransceiverStation.all_pojos.add(test_configuration_Test001_1);

//*************************************************
//storage_configurations
//*************************************************
		//StorageConfiguration storage_configuration_CassandraConfig1_1 = new StorageConfiguration();
		//telcoBaseTransceiverStation.all_pojos.add(storage_configuration_CassandraConfig1_1);
		//StorageConfiguration storage_configuration_GoogleBigQueryConfig1_2 = new StorageConfiguration();
		//telcoBaseTransceiverStation.all_pojos.add(storage_configuration_GoogleBigQueryConfig1_2);

//*************************************************
//computing_configurations
//*************************************************
		//ComputingConfiguration computing_configuration_GoogleComputeEngineConfig1_1 = new ComputingConfiguration();
		//telcoBaseTransceiverStation.all_pojos.add(computing_configuration_GoogleComputeEngineConfig1_1);
		//ComputingConfiguration computing_configuration_CassandraComputingConfiguration1_2 = new ComputingConfiguration();
		//telcoBaseTransceiverStation.all_pojos.add(computing_configuration_CassandraComputingConfiguration1_2);


//*************************************************
//Cloud Services
//*************************************************




//*************************************************
//Cloud Service BTSBroker
//*************************************************
		CloudService cloud_service_BTSBroker_1 = new CloudService();
		telcoBaseTransceiverStation.all_pojos.add(cloud_service_BTSBroker_1);
		telcoBaseTransceiverStation.all_cloud_services.add(cloud_service_BTSBroker_1);
		cloud_service_BTSBroker_1.addId("_YSRUIERREeeXpvCVjWTYeA");
		cloud_service_BTSBroker_1.setName("BTSBroker");	
		cloud_service_BTSBroker_1.addServiceType("VM");
		cloud_service_BTSBroker_1.addCloudProvider("");
		cloud_service_BTSBroker_1.addDataProvider("");
		cloud_service_BTSBroker_1.addComputingConfigs("GoogleComputeEngineConfig1");
		cloud_service_BTSBroker_1.addStorageConfigs("CassandraConfig1");
		cloud_service_BTSBroker_1.addStorageConfigs("GoogleBigQueryConfig1");
		cloud_service_BTSBroker_1.addCommunicationConfigs("MQTTConfig1");

//*************************************************
//Cloud Service F1MicroMachine
//*************************************************
		CloudService cloud_service_F1MicroMachine_2 = new CloudService();
		telcoBaseTransceiverStation.all_pojos.add(cloud_service_F1MicroMachine_2);
		telcoBaseTransceiverStation.all_cloud_services.add(cloud_service_F1MicroMachine_2);
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
		cloud_service_IngestionClient_3.addId("_wgQJgE0BEeedg6nzD0_JBg");
		cloud_service_IngestionClient_3.setName("IngestionClient");	
		cloud_service_IngestionClient_3.addServiceType("VM");
		cloud_service_IngestionClient_3.addCloudProvider("");
		cloud_service_IngestionClient_3.addDataProvider("");
		cloud_service_IngestionClient_3.addComputingConfigs("GoogleComputeEngineConfig1");
		cloud_service_IngestionClient_3.addCommunicationConfigs("MQTTConfig1");

//*************************************************
//Cloud Service BTSMonitoringDataService
//*************************************************
		CloudService cloud_service_BTSMonitoringDataService_4 = new CloudService();
		telcoBaseTransceiverStation.all_pojos.add(cloud_service_BTSMonitoringDataService_4);
		telcoBaseTransceiverStation.all_cloud_services.add(cloud_service_BTSMonitoringDataService_4);
		cloud_service_BTSMonitoringDataService_4.addId("_-WXkwE0BEeedg6nzD0_JBg");
		cloud_service_BTSMonitoringDataService_4.setName("BTSMonitoringDataService");	
		cloud_service_BTSMonitoringDataService_4.addServiceType("VM");
		cloud_service_BTSMonitoringDataService_4.addCloudProvider("");
		cloud_service_BTSMonitoringDataService_4.addDataProvider("");
		cloud_service_BTSMonitoringDataService_4.addComputingConfigs("GoogleComputeEngineConfig1");
		cloud_service_BTSMonitoringDataService_4.addCommunicationConfigs("MQTTConfig1");

//*************************************************
//Cloud Service Cassandra
//*************************************************
		CloudService cloud_service_Cassandra_5 = new CloudService();
		telcoBaseTransceiverStation.all_pojos.add(cloud_service_Cassandra_5);
		telcoBaseTransceiverStation.all_cloud_services.add(cloud_service_Cassandra_5);
		cloud_service_Cassandra_5.addId("_2LB_4FgWEeeeTquJkarvqA");
		cloud_service_Cassandra_5.setName("Cassandra");	
		cloud_service_Cassandra_5.addServiceType("VM");
		cloud_service_Cassandra_5.addCloudProvider("");
		cloud_service_Cassandra_5.addDataProvider("");
		cloud_service_Cassandra_5.addComputingConfigs("CassandraComputingConfiguration1");

//*************************************************
//Cloud Service BigQuery
//*************************************************
		CloudService cloud_service_BigQuery_6 = new CloudService();
		telcoBaseTransceiverStation.all_pojos.add(cloud_service_BigQuery_6);
		telcoBaseTransceiverStation.all_cloud_services.add(cloud_service_BigQuery_6);
		cloud_service_BigQuery_6.addId("_6vtsAFgWEeeeTquJkarvqA");
		cloud_service_BigQuery_6.setName("BigQuery");	
		cloud_service_BigQuery_6.addServiceType("VM");
		cloud_service_BigQuery_6.addCloudProvider("");
		cloud_service_BigQuery_6.addDataProvider("");

//*************************************************
//Virtual Sensors
//*************************************************




//*************************************************
//Virtual Sensor TemperatureSensor
//*************************************************
		VirtualSensor virtual_sensor_TemperatureSensor_1 = new VirtualSensor();
		telcoBaseTransceiverStation.all_pojos.add(virtual_sensor_TemperatureSensor_1);
		telcoBaseTransceiverStation.all_virtual_sensors.add(virtual_sensor_TemperatureSensor_1);
		virtual_sensor_TemperatureSensor_1.addId("_WqOYQERREeeXpvCVjWTYeA");
		virtual_sensor_TemperatureSensor_1.setName("TemperatureSensor");	
		virtual_sensor_TemperatureSensor_1.addSwCapabilities("getProtocol");
		virtual_sensor_TemperatureSensor_1.addSwCapabilities("getRate");
		virtual_sensor_TemperatureSensor_1.addSwCapabilities("setProtocol");
		virtual_sensor_TemperatureSensor_1.addSwCapabilities("setRate");
		virtual_sensor_TemperatureSensor_1.addLocation("this is the location");
		virtual_sensor_TemperatureSensor_1.addDescription("this is the description");
		virtual_sensor_TemperatureSensor_1.addOwnedUnits("HwTemperatureSensor");
		virtual_sensor_TemperatureSensor_1.addHasTimestampMechanism("false");
		virtual_sensor_TemperatureSensor_1.addTimestampMaxLatency("string value for the latency");
		virtual_sensor_TemperatureSensor_1.addDeployedOn("HwTemperatureSensor");



//*************************************************
//Virtual Sensor ElectricitySensor
//*************************************************
		VirtualSensor virtual_sensor_ElectricitySensor_2 = new VirtualSensor();
		telcoBaseTransceiverStation.all_pojos.add(virtual_sensor_ElectricitySensor_2);
		telcoBaseTransceiverStation.all_virtual_sensors.add(virtual_sensor_ElectricitySensor_2);
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
		virtual_sensor_ElectricitySensor_2.addDeployedOn("HwElectricitySensor");



//*************************************************
//Virtual Sensor AirConditioningSensor
//*************************************************
		VirtualSensor virtual_sensor_AirConditioningSensor_3 = new VirtualSensor();
		telcoBaseTransceiverStation.all_pojos.add(virtual_sensor_AirConditioningSensor_3);
		telcoBaseTransceiverStation.all_virtual_sensors.add(virtual_sensor_AirConditioningSensor_3);
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
		virtual_sensor_AirConditioningSensor_3.addDeployedOn("HwAirConditioningSensor");




//*************************************************
//Virtual Gateways
//*************************************************




//*************************************************
//Virtual Gateway IoTGateway
//*************************************************
		VirtualGateway virtual_gateway_IoTGateway_1 = new VirtualGateway();
		telcoBaseTransceiverStation.all_pojos.add(virtual_gateway_IoTGateway_1);
		telcoBaseTransceiverStation.all_virtual_gateways.add(virtual_gateway_IoTGateway_1);
		virtual_gateway_IoTGateway_1.addId("_plYu0EReEeeXpvCVjWTYeA");
		virtual_gateway_IoTGateway_1.setName("IoTGateway");	
		virtual_gateway_IoTGateway_1.addLocation("");
		virtual_gateway_IoTGateway_1.addDescription("");
		virtual_gateway_IoTGateway_1.addHasTimestampMechanism("false");
		virtual_gateway_IoTGateway_1.addTimestampMaxLatency("");




//*************************************************
//Sensor HwTemperatureSensor
//*************************************************
		Sensor sensor_HwTemperatureSensor_1 = new Sensor();
		telcoBaseTransceiverStation.all_pojos.add(sensor_HwTemperatureSensor_1);
		telcoBaseTransceiverStation.all_sensors.add(sensor_HwTemperatureSensor_1);
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
		sensor_HwAirConditioningSensor_3.addId("_iSyq8EReEeeXpvCVjWTYeA");
		sensor_HwAirConditioningSensor_3.setName("HwAirConditioningSensor");	
		sensor_HwAirConditioningSensor_3.addLocation("");
		sensor_HwAirConditioningSensor_3.addDescription("");
		sensor_HwAirConditioningSensor_3.addHasTimestampMechanism("false");
		sensor_HwAirConditioningSensor_3.addTimestampMaxLatency("");


    

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
		communication_BTSBroker_IngestionClient_1.addId("_XclXYERTEeeXpvCVjWTYeA");
		communication_BTSBroker_IngestionClient_1.setName("BTSBroker_IngestionClient");	
		communication_BTSBroker_IngestionClient_1.addCommunicationConfigs("MQTTConfig1");
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
		communication_BTSBroker_IotGateway_2.addId("_hrIz0EUIEeebuPNq01--pQ");
		communication_BTSBroker_IotGateway_2.setName("BTSBroker_IotGateway");	
		communication_BTSBroker_IotGateway_2.addCommunicationConfigs("MQTTConfig1");
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
		communication_IoTGateway_TemperatureSensor_3.addId("_pOepcEUIEeebuPNq01--pQ");
		communication_IoTGateway_TemperatureSensor_3.setName("IoTGateway_TemperatureSensor");	
		communication_IoTGateway_TemperatureSensor_3.addCommunicationConfigs("MQTTConfig1");
		communication_IoTGateway_TemperatureSensor_3.addLocation("");
		communication_IoTGateway_TemperatureSensor_3.addDescription("");
		communication_IoTGateway_TemperatureSensor_3.addHasTimestampMechanism("false");
		communication_IoTGateway_TemperatureSensor_3.addTimestampMaxLatency("");
		communication_IoTGateway_TemperatureSensor_3.addConnectionEnds("TemperatureSensor");
		communication_IoTGateway_TemperatureSensor_3.addConnectionEnds("IoTGateway");



//*************************************************
//Communication IoTGateway_ElectricitySensor
//*************************************************
		Communication communication_IoTGateway_ElectricitySensor_4 = new Communication();
		telcoBaseTransceiverStation.all_pojos.add(communication_IoTGateway_ElectricitySensor_4);
		telcoBaseTransceiverStation.all_communications.add(communication_IoTGateway_ElectricitySensor_4);
		communication_IoTGateway_ElectricitySensor_4.addId("_wuSp8EUIEeebuPNq01--pQ");
		communication_IoTGateway_ElectricitySensor_4.setName("IoTGateway_ElectricitySensor");	
		communication_IoTGateway_ElectricitySensor_4.addCommunicationConfigs("MQTTConfig1");
		communication_IoTGateway_ElectricitySensor_4.addLocation("");
		communication_IoTGateway_ElectricitySensor_4.addDescription("");
		communication_IoTGateway_ElectricitySensor_4.addHasTimestampMechanism("false");
		communication_IoTGateway_ElectricitySensor_4.addTimestampMaxLatency("");
		communication_IoTGateway_ElectricitySensor_4.addConnectionEnds("ElectricitySensor");
		communication_IoTGateway_ElectricitySensor_4.addConnectionEnds("IoTGateway");



//*************************************************
//Communication IoTGateway_AirConditioningSensor
//*************************************************
		Communication communication_IoTGateway_AirConditioningSensor_5 = new Communication();
		telcoBaseTransceiverStation.all_pojos.add(communication_IoTGateway_AirConditioningSensor_5);
		telcoBaseTransceiverStation.all_communications.add(communication_IoTGateway_AirConditioningSensor_5);
		communication_IoTGateway_AirConditioningSensor_5.addId("_N0eV8EUJEeebuPNq01--pQ");
		communication_IoTGateway_AirConditioningSensor_5.setName("IoTGateway_AirConditioningSensor");	
		communication_IoTGateway_AirConditioningSensor_5.addCommunicationConfigs("MQTTConfig1");
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
		communication_IngestionClient_BTSMonitoringDataService_6.addId("_Eu1isE0CEeedg6nzD0_JBg");
		communication_IngestionClient_BTSMonitoringDataService_6.setName("IngestionClient_BTSMonitoringDataService");	
		communication_IngestionClient_BTSMonitoringDataService_6.addCommunicationConfigs("MQTTConfig1");
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
//Communication Configuration MQTTConfig1
//*************************************************
		CommunicationConfiguration communication_configuration_MQTTConfig1_1 = new CommunicationConfiguration();
		telcoBaseTransceiverStation.all_pojos.add(communication_configuration_MQTTConfig1_1);
		telcoBaseTransceiverStation.all_communication_configurations.add(communication_configuration_MQTTConfig1_1);
		communication_configuration_MQTTConfig1_1.addId("_8V-5EEdpEee5F8b1qsyZMA");
		communication_configuration_MQTTConfig1_1.setName("MQTTConfig1");	
		communication_configuration_MQTTConfig1_1.addProtocolType("MQTT");
		communication_configuration_MQTTConfig1_1.addClientID("Jolla");
		communication_configuration_MQTTConfig1_1.addPortNumber("1883");
		communication_configuration_MQTTConfig1_1.addServerIP("192.168.11.11");
		communication_configuration_MQTTConfig1_1.addTopics("topic001");
		communication_configuration_MQTTConfig1_1.addTopics("topic002");
		communication_configuration_MQTTConfig1_1.addQosLevel("");
		communication_configuration_MQTTConfig1_1.addKeepAlive("210");



//*************************************************
//Communication Configuration MQTTConfig2
//*************************************************
		CommunicationConfiguration communication_configuration_MQTTConfig2_2 = new CommunicationConfiguration();
		telcoBaseTransceiverStation.all_pojos.add(communication_configuration_MQTTConfig2_2);
		telcoBaseTransceiverStation.all_communication_configurations.add(communication_configuration_MQTTConfig2_2);
		communication_configuration_MQTTConfig2_2.addId("_U4jccEqKEeemwObUvM0ZZA");
		communication_configuration_MQTTConfig2_2.setName("MQTTConfig2");	
		communication_configuration_MQTTConfig2_2.addProtocolType("TCP");
		communication_configuration_MQTTConfig2_2.addClientID("undef");
		communication_configuration_MQTTConfig2_2.addPortNumber("undef");
		communication_configuration_MQTTConfig2_2.addServerIP("undef");
		communication_configuration_MQTTConfig2_2.addQosLevel("0");
		communication_configuration_MQTTConfig2_2.addKeepAlive("undef");


    
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
		
	
	}
	
	
}
