<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Add_Team_With_Invitation</name>
   <tag></tag>
   <elementGuidId>f94289da-32dd-4121-b03e-63a2cd993a2e</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <smartLocatorEnabled>false</smartLocatorEnabled>
   <useRalativeImagePath>false</useRalativeImagePath>
   <authorizationRequest>
      <authorizationInfo>
         <entry>
            <key>bearerToken</key>
            <value>${token}</value>
         </entry>
      </authorizationInfo>
      <authorizationType>Bearer</authorizationType>
   </authorizationRequest>
   <autoUpdateContent>false</autoUpdateContent>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n  \&quot;name\&quot;: \&quot;${teamNameEn}\&quot;,\n  \&quot;nameAr\&quot;: \&quot;${teamNameAr}\&quot;,\n  \&quot;about\&quot;: \&quot;about\&quot;,\n  \&quot;logo\&quot;:\&quot;esports/aa380dd2-1eb4-45ab-a495-a9539ce3235a__jpgImage.jpg\&quot;,\n  \&quot;publicProfile\&quot;: true,\n  \&quot;gameId\&quot;: 1,\n  \&quot;invitations\&quot;:[${invitations}]\n}&quot;,
  &quot;contentType&quot;: &quot;text/plain&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;
}</httpBodyContent>
   <httpBodyType>text</httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>application/json</value>
      <webElementGuid>8e9bbb03-e2d5-4630-8839-c73ca7c99c1b</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Authorization</name>
      <type>Main</type>
      <value>Bearer ${token}</value>
      <webElementGuid>80845963-fc46-4cdd-9783-cfce8e8e7353</webElementGuid>
   </httpHeaderProperties>
   <katalonVersion>9.4.0</katalonVersion>
   <maxResponseSize>-1</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <path></path>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>${home_url}/team-club/v1/teams</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>-1</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>d2761f65-c959-4f80-86fd-d4c8969c0ccb</id>
      <masked>false</masked>
      <name>invitations</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>6df852f2-b6ec-4e69-8743-0b96f092fcfd</id>
      <masked>false</masked>
      <name>teamNameEn</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>6a1ce5d7-80a5-43ae-94c9-73dc14b8ab8a</id>
      <masked>false</masked>
      <name>teamNameAr</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.API_ACCESS_TOKEN</defaultValue>
      <description></description>
      <id>284d9c0a-ad63-438a-b246-d8608a1c22e4</id>
      <masked>false</masked>
      <name>token</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.HOME_URL</defaultValue>
      <description></description>
      <id>b888e78c-bfe5-4b1c-8ab7-5e6d1cf626f8</id>
      <masked>false</masked>
      <name>home_url</name>
   </variables>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

println('request is '+ request.httpBody.toString())
ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()


WS.verifyResponseStatusCode(response, 201)

assertThat(response.getStatusCode()).isEqualTo(201)




</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
