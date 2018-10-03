package jetty_example;

import org.hl7.fhir.dstu3.model.Base;
import org.hl7.fhir.dstu3.model.OperationDefinition;
import org.hl7.fhir.instance.model.api.IBaseResource;
import ca.uhn.fhir.parser.IParser;
import ca.uhn.fhir.context.FhirContext;

import org.hl7.fhir.dstu3.model.NamingSystem;

public class ParseResource {
public  OperationDefinition definition1;

IBaseResource parsedFile;
 
public ParseResource() {
	
	IParser xmlParser = FhirContext.forDstu3().newXmlParser();
	
	String od_xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\r\n" + 
			"<OperationDefinition xmlns=\"http://hl7.org/fhir\">\r\n" + 
			"	<id value=\"GPConnect-CareRecord-Operation-1\"/>\r\n" + 
			"	<meta>\r\n" + 
			"		<lastUpdated value=\"2018-01-25T00:00:00+01:00\"/>\r\n" + 
			"	</meta>\r\n" + 
			"	<url value=\"https://fhir.nhs.uk/STU3/OperationDefinition/GPConnect-CareRecord-Operation-1\"/>\r\n" + 
			"	<version value=\"1.0.0\"/>\r\n" + 
			"	<name value=\"GPConnect-CareRecord-Operation\"/>\r\n" + 
			"	<status value=\"draft\"/>\r\n" + 
			"	<kind value=\"operation\"/>\r\n" + 
			"	<date value=\"2018-01-25\"/>\r\n" + 
			"	<publisher value=\"NHS Digital\"/>\r\n" + 
			"	<contact>\r\n" + 
			"		<name value=\"Interoperability Team\"/>\r\n" + 
			"		<telecom>\r\n" + 
			"			<system value=\"email\"/>\r\n" + 
			"			<value value=\"interoperabilityteam@nhs.net\"/>\r\n" + 
			"			<use value=\"work\"/>\r\n" + 
			"		</telecom>\r\n" + 
			"	</contact>\r\n" + 
			"	<description value=\"Request to retrieve the Patient's Care Record\"/>\r\n" + 
			"	<code value=\"gpc.getcarerecord\"/>\r\n" + 
			"	<resource value=\"Patient\"/>\r\n" + 
			"	<system value=\"false\"/>\r\n" + 
			"	<type value=\"true\"/>\r\n" + 
			"	<instance value=\"false\"/>\r\n" + 
			"	<parameter>\r\n" + 
			"		<name value=\"patientNHSNumber\"/>\r\n" + 
			"		<use value=\"in\"/>\r\n" + 
			"		<min value=\"1\"/>\r\n" + 
			"		<max value=\"1\"/>\r\n" + 
			"		<documentation value=\"Patient that matches the NHS Number\"/>\r\n" + 
			"		<type value=\"Patient\"/>\r\n" + 
			"		<profile>\r\n" + 
			"			<reference value=\"https://fhir.nhs.uk/STU3/StructureDefinition/CareConnect-GPC-Patient-1\"/>\r\n" + 
			"		</profile>\r\n" + 
			"	</parameter>\r\n" + 
			"	<parameter>\r\n" + 
			"		<name value=\"recordSection\"/>\r\n" + 
			"		<use value=\"in\"/>\r\n" + 
			"		<min value=\"1\"/>\r\n" + 
			"		<max value=\"1\"/>\r\n" + 
			"		<documentation value=\"Section of the care record defined by the parameter\"/>\r\n" + 
			"		<type value=\"CodeableConcept\"/>\r\n" + 
			"		<binding>\r\n" + 
			"			<strength value=\"required\"/>\r\n" + 
			"			<valueSetUri value=\"https://fhir.nhs.uk/STU3/ValueSet/GPConnect-RecordSection-1\"/>\r\n" + 
			"		</binding>\r\n" + 
			"	</parameter>\r\n" + 
			"	<parameter>\r\n" + 
			"		<name value=\"timePeriod\"/>\r\n" + 
			"		<use value=\"in\"/>\r\n" + 
			"		<min value=\"0\"/>\r\n" + 
			"		<max value=\"1\"/>\r\n" + 
			"		<documentation value=\"View of the Patient's care record. This will be a view of a specified section of the care record.\"/>\r\n" + 
			"		<type value=\"Period\"/>\r\n" + 
			"	</parameter>\r\n" + 
			"	<parameter>\r\n" + 
			"		<name value=\"response\"/>\r\n" + 
			"		<use value=\"out\"/>\r\n" + 
			"		<min value=\"1\"/>\r\n" + 
			"		<max value=\"1\"/>\r\n" + 
			"		<documentation value=\"The searchset bundle resource that has been returned in response to the given input parameters\"/>\r\n" + 
			"		<type value=\"Bundle\"/>\r\n" + 
			"		<profile>\r\n" + 
			"			<reference value=\"https://fhir.nhs.uk/STU3/StructureDefinition/GPConnect-Searchset-Bundle-1\"/>\r\n" + 
			"		</profile>\r\n" + 
			"	</parameter>\r\n" + 
			"</OperationDefinition>";
//	System.out.println(st);
	IBaseResource resource= xmlParser.parseResource(od_xml);
	OperationDefinition definition1 = (org.hl7.fhir.dstu3.model.OperationDefinition) resource;
	System.out.println(definition1.getId());
	System.out.println(definition1.getMeta().getLastUpdated());
	System.out.println("get url " + definition1.getUrl());
	
	
	
	
	String ns_xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\r\n" + 
			"<NamingSystem xmlns=\"http://hl7.org/fhir\">\r\n" + 
			"	<meta>\r\n" + 
			"		<profile value=\"https://fhir.nhs.uk/STU3/StructureDefinition/NHSDigital-NamingSystem-1\"/>\r\n" + 
			"	</meta>\r\n" + 
			"	<name value=\"ODS Organization Code\"/>\r\n" + 
			"	<status value=\"draft\"/>\r\n" + 
			"	<kind value=\"identifier\"/>\r\n" + 
			"	<date value=\"2018-06-18\"/>\r\n" + 
			"	<publisher value=\"NHS Digital\"/>\r\n" + 
			"	<contact>\r\n" + 
			"		<name value=\"Interoperability Team\"/>\r\n" + 
			"		<telecom>\r\n" + 
			"			<system value=\"email\"/>\r\n" + 
			"			<value value=\"interoperabilityteam@nhs.net\"/>\r\n" + 
			"			<use value=\"work\"/>\r\n" + 
			"		</telecom>\r\n" + 
			"	</contact>\r\n" + 
			"	<responsible value=\"NHS Digital\"/>\r\n" + 
			"	<description value=\"The identifier system for an Organization registered with the Organisation Data Service (ODS).\"/>\r\n" + 
			"	<usage value=\"To be used to identify Organization's registered with the Organisation Data Service (ODS).\"/>\r\n" + 
			"	<uniqueId>\r\n" + 
			"		<type value=\"uri\"/>\r\n" + 
			"		<value value=\"https://fhir.nhs.uk/Id/ods-organization-code\"/>\r\n" + 
			"		<preferred value=\"true\"/>\r\n" + 
			"	</uniqueId>\r\n" + 
			"	<uniqueId>\r\n" + 
			"		<type value=\"oid\"/>\r\n" + 
			"		<value value=\"2.16.840.1.113883.2.1.3.2.4.19.1\"/>\r\n" + 
			"		<preferred value=\"false\"/>\r\n" + 
			"	</uniqueId>\r\n" + 
			"</NamingSystem>";
//	System.out.println(st);
	 resource= xmlParser.parseResource(ns_xml);
	NamingSystem definition2 = (org.hl7.fhir.dstu3.model.NamingSystem) resource;
	System.out.println("get naming system id : " + definition2.getName() );
	System.out.println("get naming system id : " + definition2.getUniqueId().get(0).getValue() );
	System.out.println("get naming system id : " + definition2.getUniqueId().get(1).getValue() );
	System.out.println("get naming system id : " + definition2.getMeta().getProfile().get(0).getValue());
	System.out.println("get url " + definition2.getUrl());
	
}
}
