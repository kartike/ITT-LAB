<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

<xsl:template match="/">
  <html>
  <body>
      <xsl:for-each select="info/student">
        <p><xsl:value-of select="usn"/></p>
        <p><xsl:value-of select="name"/></p>
        <p><xsl:value-of select="college"/></p>
        <p><xsl:value-of select="branch"/></p>
        <p><xsl:value-of select="yoj"/></p>
        <p><xsl:value-of select="email"/></p>
      </xsl:for-each>
  </body>
  </html>
</xsl:template>
</xsl:stylesheet>
