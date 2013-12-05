Strut2 FileUpload Process
=========================

This is example demonstrates , how to upload files using Struts2 Framework <br>

index.jsp
---------

&lt;s:file name="uploadImage" label="Upload" /&gt;

and &lt;s:form&gt; tag we should include enctype="multipart/form-data" and method should be "POST" <br>
<br>

<b>Conventions to Fallow while Uploading Files through Struts2 Framwork.</b><br>

FileUploadAction.java
---------------------

1. If our file field name is UploadImage Then we need to take two more properties in Struts Action.<br>
2. The two properties of String type must fallow the convention. <uploadImage>FileName, <uploadImage>ContentType.<br>
3. We need to create setters and getters for the two above properties.
