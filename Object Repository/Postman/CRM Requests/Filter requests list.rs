<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Filter requests list</name>
   <tag></tag>
   <elementGuidId>63a4af15-dfb7-4c74-8233-be272b1dbf6d</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <smartLocatorEnabled>false</smartLocatorEnabled>
   <useRalativeImagePath>false</useRalativeImagePath>
   <autoUpdateContent>true</autoUpdateContent>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n          \&quot;filters\&quot;: [\n            {\n              \&quot;columnName\&quot;: \&quot;name\&quot;,\n              \&quot;columnValue\&quot;: null,\n              \&quot;columnValues\&quot;: [],\n              \&quot;operator\&quot;: \&quot;equals\&quot;\n            },\n            {\n              \&quot;columnName\&quot;: \&quot;status\&quot;,\n              \&quot;columnValue\&quot;: null,\n              \&quot;columnValues\&quot;: [\n                \&quot;2\&quot;\n              ],\n              \&quot;operator\&quot;: \&quot;equals\&quot;\n            }\n          ],\n          \&quot;pageNo\&quot;: 0,\n          \&quot;pageLength\&quot;: 10,\n          \&quot;sorting\&quot;: [\n            {\n              \&quot;sortName\&quot;: \&quot;createdAt\&quot;,\n              \&quot;sortType\&quot;: \&quot;DESC\&quot;,\n              \&quot;sortColumnType\&quot;: \&quot;date\&quot;\n            }\n          ]\n        }&quot;,
  &quot;contentType&quot;: &quot;application/json&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;
}</httpBodyContent>
   <httpBodyType>text</httpBodyType>
   <httpHeaderProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>application/json</value>
      <webElementGuid>d652f7fa-2e1f-4431-a44e-9b5acfe62b37</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Authorization</name>
      <type>Main</type>
      <value>Bearer</value>
      <webElementGuid>52c71ddd-89cc-48bc-a94d-d1c7e2a67633</webElementGuid>
   </httpHeaderProperties>
   <katalonVersion>9.4.0</katalonVersion>
   <maxResponseSize>-1</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <path></path>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>https://stage.saudiesports.sa/api/team-club/v1/requests/club-owner-request</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>-1</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
