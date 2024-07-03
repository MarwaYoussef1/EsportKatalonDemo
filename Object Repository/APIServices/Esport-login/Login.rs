<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Login</name>
   <tag></tag>
   <elementGuidId>e9d4d663-1b73-4986-a01c-d9c0a11269fb</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <smartLocatorEnabled>false</smartLocatorEnabled>
   <useRalativeImagePath>false</useRalativeImagePath>
   <autoUpdateContent>false</autoUpdateContent>
   <connectionTimeout>0</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;parameters&quot;: [
    {
      &quot;name&quot;: &quot;password&quot;,
      &quot;value&quot;: &quot;${password}&quot;
    },
    {
      &quot;name&quot;: &quot;grant_type&quot;,
      &quot;value&quot;: &quot;password&quot;
    },
    {
      &quot;name&quot;: &quot;client_id&quot;,
      &quot;value&quot;: &quot;WEB&quot;
    },
    {
      &quot;name&quot;: &quot;username&quot;,
      &quot;value&quot;: &quot;${userEmail}&quot;
    }
  ]
}</httpBodyContent>
   <httpBodyType>x-www-form-urlencoded</httpBodyType>
   <httpHeaderProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>application/x-www-form-urlencoded</value>
      <webElementGuid>9a36259a-7f5a-495c-a4d7-08361e2d1fbd</webElementGuid>
   </httpHeaderProperties>
   <katalonVersion>9.4.0</katalonVersion>
   <maxResponseSize>0</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <path></path>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>${home_url}/auth/realms/cust_esports.com/protocol/openid-connect/token</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>0</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <variables>
      <defaultValue>'Auto_club@mailinator.com'</defaultValue>
      <description></description>
      <id>5b34f017-f14e-4891-bbb1-4c09d76b33d0</id>
      <masked>false</masked>
      <name>userEmail</name>
   </variables>
   <variables>
      <defaultValue>'P@ssw0rd'</defaultValue>
      <description></description>
      <id>32323314-b172-468f-8608-ddf3d354435a</id>
      <masked>false</masked>
      <name>password</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.HOME_URL</defaultValue>
      <description></description>
      <id>e0ce681e-5065-4e2a-86e2-e300c3ad2f60</id>
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

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()

WS.verifyResponseStatusCode(response, 200)

GlobalVariable.API_ACCESS_TOKEN=WS.getElementPropertyValue(response, 'access_token')


assertThat(response.getStatusCode()).isEqualTo(200)




</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
