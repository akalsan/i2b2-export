<%--
  #%L
  i2b2 Export Service
  %%
  Copyright (C) 2013 Emory University
  %%
  Licensed under the Apache License, Version 2.0 (the "License");
  you may not use this file except in compliance with the License.
  You may obtain a copy of the License at
  
       http://www.apache.org/licenses/LICENSE-2.0
  
  Unless required by applicable law or agreed to in writing, software
  distributed under the License is distributed on an "AS IS" BASIS,
  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
  See the License for the specific language governing permissions and
  limitations under the License.
  #L%
  --%>
<%@ page import="edu.emory.bmi.aiw.i2b2export.i2b2.I2b2CommUtil" %>

<html>
<body>
<h2>i2b2-export-service</h2>
<b>i2b2 Proxy URL:</b> <%= I2b2CommUtil.getProxyUrl() %>
<br/>
<b>i2b2 Service Host URL:</b> <%= I2b2CommUtil.getI2b2ServiceHostUrl() %>
</body>
</html>
