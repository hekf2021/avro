/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package com.avro;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Info extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 6905343625261727916L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Info\",\"namespace\":\"com.avro\",\"fields\":[{\"name\":\"id\",\"type\":\"string\"},{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"apk\",\"type\":[\"string\",\"null\"]},{\"name\":\"com\",\"type\":[\"string\",\"null\"]}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.CharSequence id;
  @Deprecated public java.lang.CharSequence name;
  @Deprecated public java.lang.CharSequence apk;
  @Deprecated public java.lang.CharSequence com;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public Info() {}

  /**
   * All-args constructor.
   */
  public Info(java.lang.CharSequence id, java.lang.CharSequence name, java.lang.CharSequence apk, java.lang.CharSequence com) {
    this.id = id;
    this.name = name;
    this.apk = apk;
    this.com = com;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return id;
    case 1: return name;
    case 2: return apk;
    case 3: return com;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: id = (java.lang.CharSequence)value$; break;
    case 1: name = (java.lang.CharSequence)value$; break;
    case 2: apk = (java.lang.CharSequence)value$; break;
    case 3: com = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'id' field.
   */
  public java.lang.CharSequence getId() {
    return id;
  }

  /**
   * Sets the value of the 'id' field.
   * @param value the value to set.
   */
  public void setId(java.lang.CharSequence value) {
    this.id = value;
  }

  /**
   * Gets the value of the 'name' field.
   */
  public java.lang.CharSequence getName() {
    return name;
  }

  /**
   * Sets the value of the 'name' field.
   * @param value the value to set.
   */
  public void setName(java.lang.CharSequence value) {
    this.name = value;
  }

  /**
   * Gets the value of the 'apk' field.
   */
  public java.lang.CharSequence getApk() {
    return apk;
  }

  /**
   * Sets the value of the 'apk' field.
   * @param value the value to set.
   */
  public void setApk(java.lang.CharSequence value) {
    this.apk = value;
  }

  /**
   * Gets the value of the 'com' field.
   */
  public java.lang.CharSequence getCom() {
    return com;
  }

  /**
   * Sets the value of the 'com' field.
   * @param value the value to set.
   */
  public void setCom(java.lang.CharSequence value) {
    this.com = value;
  }

  /**
   * Creates a new Info RecordBuilder.
   * @return A new Info RecordBuilder
   */
  public static com.avro.Info.Builder newBuilder() {
    return new com.avro.Info.Builder();
  }
  
  /**
   * Creates a new Info RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Info RecordBuilder
   */
  public static com.avro.Info.Builder newBuilder(com.avro.Info.Builder other) {
    return new com.avro.Info.Builder(other);
  }
  
  /**
   * Creates a new Info RecordBuilder by copying an existing Info instance.
   * @param other The existing instance to copy.
   * @return A new Info RecordBuilder
   */
  public static com.avro.Info.Builder newBuilder(com.avro.Info other) {
    return new com.avro.Info.Builder(other);
  }
  
  /**
   * RecordBuilder for Info instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Info>
    implements org.apache.avro.data.RecordBuilder<Info> {

    private java.lang.CharSequence id;
    private java.lang.CharSequence name;
    private java.lang.CharSequence apk;
    private java.lang.CharSequence com;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }
    
    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.avro.Info.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.name)) {
        this.name = data().deepCopy(fields()[1].schema(), other.name);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.apk)) {
        this.apk = data().deepCopy(fields()[2].schema(), other.apk);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.com)) {
        this.com = data().deepCopy(fields()[3].schema(), other.com);
        fieldSetFlags()[3] = true;
      }
    }
    
    /**
     * Creates a Builder by copying an existing Info instance
     * @param other The existing instance to copy.
     */
    private Builder(com.avro.Info other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.name)) {
        this.name = data().deepCopy(fields()[1].schema(), other.name);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.apk)) {
        this.apk = data().deepCopy(fields()[2].schema(), other.apk);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.com)) {
        this.com = data().deepCopy(fields()[3].schema(), other.com);
        fieldSetFlags()[3] = true;
      }
    }

    /**
      * Gets the value of the 'id' field.
      * @return The value.
      */
    public java.lang.CharSequence getId() {
      return id;
    }

    /**
      * Sets the value of the 'id' field.
      * @param value The value of 'id'.
      * @return This builder.
      */
    public com.avro.Info.Builder setId(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.id = value;
      fieldSetFlags()[0] = true;
      return this; 
    }

    /**
      * Checks whether the 'id' field has been set.
      * @return True if the 'id' field has been set, false otherwise.
      */
    public boolean hasId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'id' field.
      * @return This builder.
      */
    public com.avro.Info.Builder clearId() {
      id = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'name' field.
      * @return The value.
      */
    public java.lang.CharSequence getName() {
      return name;
    }

    /**
      * Sets the value of the 'name' field.
      * @param value The value of 'name'.
      * @return This builder.
      */
    public com.avro.Info.Builder setName(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.name = value;
      fieldSetFlags()[1] = true;
      return this; 
    }

    /**
      * Checks whether the 'name' field has been set.
      * @return True if the 'name' field has been set, false otherwise.
      */
    public boolean hasName() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'name' field.
      * @return This builder.
      */
    public com.avro.Info.Builder clearName() {
      name = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'apk' field.
      * @return The value.
      */
    public java.lang.CharSequence getApk() {
      return apk;
    }

    /**
      * Sets the value of the 'apk' field.
      * @param value The value of 'apk'.
      * @return This builder.
      */
    public com.avro.Info.Builder setApk(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.apk = value;
      fieldSetFlags()[2] = true;
      return this; 
    }

    /**
      * Checks whether the 'apk' field has been set.
      * @return True if the 'apk' field has been set, false otherwise.
      */
    public boolean hasApk() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'apk' field.
      * @return This builder.
      */
    public com.avro.Info.Builder clearApk() {
      apk = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'com' field.
      * @return The value.
      */
    public java.lang.CharSequence getCom() {
      return com;
    }

    /**
      * Sets the value of the 'com' field.
      * @param value The value of 'com'.
      * @return This builder.
      */
    public com.avro.Info.Builder setCom(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.com = value;
      fieldSetFlags()[3] = true;
      return this; 
    }

    /**
      * Checks whether the 'com' field has been set.
      * @return True if the 'com' field has been set, false otherwise.
      */
    public boolean hasCom() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'com' field.
      * @return This builder.
      */
    public com.avro.Info.Builder clearCom() {
      com = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    public Info build() {
      try {
        Info record = new Info();
        record.id = fieldSetFlags()[0] ? this.id : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.name = fieldSetFlags()[1] ? this.name : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.apk = fieldSetFlags()[2] ? this.apk : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.com = fieldSetFlags()[3] ? this.com : (java.lang.CharSequence) defaultValue(fields()[3]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  private static final org.apache.avro.io.DatumWriter
    WRITER$ = new org.apache.avro.specific.SpecificDatumWriter(SCHEMA$);  

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, org.apache.avro.specific.SpecificData.getEncoder(out));
  }

  private static final org.apache.avro.io.DatumReader
    READER$ = new org.apache.avro.specific.SpecificDatumReader(SCHEMA$);  

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, org.apache.avro.specific.SpecificData.getDecoder(in));
  }

}
