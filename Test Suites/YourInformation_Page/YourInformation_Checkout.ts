<?xml version="1.0" encoding="UTF-8"?>
<TestSuiteEntity>
   <description></description>
   <name>YourInformation_Checkout</name>
   <tag></tag>
   <isRerun>false</isRerun>
   <mailRecipient></mailRecipient>
   <numberOfRerun>0</numberOfRerun>
   <pageLoadTimeout>30</pageLoadTimeout>
   <pageLoadTimeoutDefault>true</pageLoadTimeoutDefault>
   <rerunFailedTestCasesOnly>false</rerunFailedTestCasesOnly>
   <rerunImmediately>false</rerunImmediately>
   <testSuiteGuid>efaef589-928e-4f2c-aafa-3cd7bb1c4189</testSuiteGuid>
   <testCaseLink>
      <guid>db282990-672d-4cd5-aefb-342cba9fd59c</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Login_Page/Positive_Case/Login</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>7806c40d-6a67-4a86-befd-ce54a1c162b6</id>
         <iterationEntity>
            <iterationType>SPECIFIC</iterationType>
            <value>1</value>
         </iterationEntity>
         <testDataId>Data Files/dataUser</testDataId>
      </testDataLink>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId>7806c40d-6a67-4a86-befd-ce54a1c162b6</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>userName</value>
         <variableId>d5364af9-9adf-489d-ac9e-3abfec869b3b</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>7806c40d-6a67-4a86-befd-ce54a1c162b6</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>password</value>
         <variableId>9782d047-30fa-49f6-8e5e-c9de18c1ece8</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>9be6e60b-1cbe-45a8-9d89-2d8aaa27f5e3</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Product_Page/Positive_Case/AddToCart_Products</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId></testDataLinkId>
         <type>DEFAULT</type>
         <value></value>
         <variableId>0ec49a29-9b6c-4935-a40e-698b47b129b5</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>e42684c8-23ea-4419-8ceb-bad5767eabc8</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Cart_Page/Positive_Case/ProductCart</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId></testDataLinkId>
         <type>DEFAULT</type>
         <value></value>
         <variableId>796c1e7f-9aec-4e14-9d92-be3d40f98ee5</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>e12f2fa4-69f2-419c-8306-10a6627121aa</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/YourInformation_Page/Negative_Case/InputData_YourInformation_Back</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>50b1feb2-ea1a-4e87-b309-246711af43c0</id>
         <iterationEntity>
            <iterationType>RANGE</iterationType>
            <value>1-5</value>
         </iterationEntity>
         <testDataId>Data Files/buyerInfo</testDataId>
      </testDataLink>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId>50b1feb2-ea1a-4e87-b309-246711af43c0</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>FirstName</value>
         <variableId>f76c2f27-6539-4386-be52-c8a754ed5912</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>50b1feb2-ea1a-4e87-b309-246711af43c0</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>LastName</value>
         <variableId>4a4fa700-d574-48e7-851e-9d1e7d0d769b</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>50b1feb2-ea1a-4e87-b309-246711af43c0</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>PostalCode</value>
         <variableId>99266754-3beb-4c53-97d9-fd1fc0d7e6c9</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>c8b4b0be-688f-48a0-bb21-76bae767f9f5</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/YourInformation_Page/Negative_Case/FirstName_Null</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>5af8f2d0-33f8-47d2-af7a-8a959155701a</id>
         <iterationEntity>
            <iterationType>SPECIFIC</iterationType>
            <value>6</value>
         </iterationEntity>
         <testDataId>Data Files/buyerInfo</testDataId>
      </testDataLink>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId></testDataLinkId>
         <type>DEFAULT</type>
         <value></value>
         <variableId>8ebecb91-d9d2-4989-a943-b7d5ad501490</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>5af8f2d0-33f8-47d2-af7a-8a959155701a</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>FirstName</value>
         <variableId>3573faa0-068f-431b-a564-54e0ce243a73</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>5af8f2d0-33f8-47d2-af7a-8a959155701a</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>LastName</value>
         <variableId>8351589d-8529-4a53-9d11-e2338245d3e9</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>5af8f2d0-33f8-47d2-af7a-8a959155701a</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>PostalCode</value>
         <variableId>afc91157-30a7-4783-b7cb-139d589d418c</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>08e8eb99-6f2e-42de-94fe-ddf25be9d030</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/YourInformation_Page/Negative_Case/LastName_Null</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>57fcf8ca-4443-4abf-955c-056f97799518</id>
         <iterationEntity>
            <iterationType>SPECIFIC</iterationType>
            <value>7</value>
         </iterationEntity>
         <testDataId>Data Files/buyerInfo</testDataId>
      </testDataLink>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId></testDataLinkId>
         <type>DEFAULT</type>
         <value></value>
         <variableId>bcf59a67-19f3-4425-8a59-493ddeed184c</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>57fcf8ca-4443-4abf-955c-056f97799518</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>FirstName</value>
         <variableId>4e97c188-6390-44d3-9f8a-65371421d3f3</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>57fcf8ca-4443-4abf-955c-056f97799518</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>LastName</value>
         <variableId>a699e62f-436f-457c-9f9d-e088599cc5bb</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>57fcf8ca-4443-4abf-955c-056f97799518</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>PostalCode</value>
         <variableId>eb9f124f-ed3a-4840-8a64-d2399a307823</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>7e131be0-faf8-47c4-90aa-24e83d0f52a5</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/YourInformation_Page/Negative_Case/PostalCode_Null</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>06c45649-6e58-48bd-ad90-2457f9384c76</id>
         <iterationEntity>
            <iterationType>SPECIFIC</iterationType>
            <value>8</value>
         </iterationEntity>
         <testDataId>Data Files/buyerInfo</testDataId>
      </testDataLink>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId></testDataLinkId>
         <type>DEFAULT</type>
         <value></value>
         <variableId>6be5130a-81d7-45f0-9d16-f263ba47c74d</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>06c45649-6e58-48bd-ad90-2457f9384c76</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>FirstName</value>
         <variableId>54aac2a4-cfeb-4007-919e-9f7ad9f173e6</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>06c45649-6e58-48bd-ad90-2457f9384c76</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>LastName</value>
         <variableId>570dec56-47ec-421d-b5e4-d31c349f0ecc</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>06c45649-6e58-48bd-ad90-2457f9384c76</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>PostalCode</value>
         <variableId>8154eefd-78ce-434e-a00d-e5e812cfb386</variableId>
      </variableLink>
   </testCaseLink>
</TestSuiteEntity>
