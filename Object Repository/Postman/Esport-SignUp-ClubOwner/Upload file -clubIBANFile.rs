<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Upload file -clubIBANFile</name>
   <tag></tag>
   <elementGuidId>94c47d5c-c917-4782-98d8-e9659969da15</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <smartLocatorEnabled>false</smartLocatorEnabled>
   <useRalativeImagePath>false</useRalativeImagePath>
   <autoUpdateContent>true</autoUpdateContent>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;parameters&quot;: [
    {
      &quot;name&quot;: &quot;file&quot;,
      &quot;type&quot;: &quot;file&quot;,
      &quot;contentType&quot;: &quot;&quot;
    },
    {
      &quot;name&quot;: &quot;file-usage&quot;,
      &quot;value&quot;: &quot;clubIBANFile&quot;,
      &quot;type&quot;: &quot;text&quot;,
      &quot;contentType&quot;: &quot;&quot;
    }
  ]
}</httpBodyContent>
   <httpBodyType>form-data</httpBodyType>
   <httpHeaderProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>authority</name>
      <type>Main</type>
      <value>stage.saudiesports.sa</value>
      <webElementGuid>4f958718-0e97-4c06-b44a-5a40d492a173</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>accept</name>
      <type>Main</type>
      <value>application/json</value>
      <webElementGuid>b40a410f-7d6d-4409-9c89-6b48eeb423f0</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>accept-language</name>
      <type>Main</type>
      <value>en-GB,en;q=0.9</value>
      <webElementGuid>468b9d94-3979-408b-9383-2520a375a1be</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>entity</name>
      <type>Main</type>
      <value>user</value>
      <webElementGuid>2ea2b9a8-f33b-4d2d-b072-114c5e43e2a8</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>origin</name>
      <type>Main</type>
      <value>https://stage.saudiesports.sa</value>
      <webElementGuid>5015e194-888f-49b6-8f69-84d3e593ced4</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>referer</name>
      <type>Main</type>
      <value>https://stage.saudiesports.sa/user/club-sign?lang=en</value>
      <webElementGuid>82088175-543f-4c57-8410-b375a41d72cf</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>sec-ch-ua</name>
      <type>Main</type>
      <value>&quot;Chromium&quot;;v=&quot;110&quot;, &quot;Not A(Brand&quot;;v=&quot;24&quot;, &quot;Google Chrome&quot;;v=&quot;110&quot;</value>
      <webElementGuid>d89ee004-729e-4768-95eb-baa435593a76</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>sec-ch-ua-mobile</name>
      <type>Main</type>
      <value>?0</value>
      <webElementGuid>a3f3bdf3-2640-4a2f-9e46-9073eae588ee</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>sec-ch-ua-platform</name>
      <type>Main</type>
      <value>&quot;Windows&quot;</value>
      <webElementGuid>6a87cdca-9a2c-4e69-8cce-58e31ef953d9</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>sec-fetch-dest</name>
      <type>Main</type>
      <value>empty</value>
      <webElementGuid>26f76fde-e497-48e1-a1e7-a99ad9ecb778</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>sec-fetch-mode</name>
      <type>Main</type>
      <value>cors</value>
      <webElementGuid>cd5a66a5-d089-4e40-a4a0-90b7d3ea0eb7</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>sec-fetch-site</name>
      <type>Main</type>
      <value>same-origin</value>
      <webElementGuid>b024427c-bfc4-440e-ba5a-e92ef83bae11</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>user-agent</name>
      <type>Main</type>
      <value>Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/110.0.0.0 Safari/537.36</value>
      <webElementGuid>113299ab-ec50-4be6-8612-09b617a0bf96</webElementGuid>
   </httpHeaderProperties>
   <katalonVersion>9.4.0</katalonVersion>
   <maxResponseSize>-1</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <path></path>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>https://stage.saudiesports.sa/api/team-club/v1/public/file/upload/</restUrl>
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
