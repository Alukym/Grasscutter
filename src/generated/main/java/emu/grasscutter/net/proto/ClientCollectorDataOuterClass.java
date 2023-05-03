// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ClientCollectorData.proto

package emu.grasscutter.net.proto;

public final class ClientCollectorDataOuterClass {
  private ClientCollectorDataOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ClientCollectorDataOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ClientCollectorData)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 BJAOMANHLNM = 9;</code>
     * @return The bJAOMANHLNM.
     */
    int getBJAOMANHLNM();

    /**
     * <code>uint32 material_id = 10;</code>
     * @return The materialId.
     */
    int getMaterialId();

    /**
     * <code>uint32 JCGPKAGJIOF = 11;</code>
     * @return The jCGPKAGJIOF.
     */
    int getJCGPKAGJIOF();
  }
  /**
   * <pre>
   * Name: IPICMDDHCHD
   * </pre>
   *
   * Protobuf type {@code ClientCollectorData}
   */
  public static final class ClientCollectorData extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ClientCollectorData)
      ClientCollectorDataOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ClientCollectorData.newBuilder() to construct.
    private ClientCollectorData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ClientCollectorData() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ClientCollectorData();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ClientCollectorData(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 72: {

              bJAOMANHLNM_ = input.readUInt32();
              break;
            }
            case 80: {

              materialId_ = input.readUInt32();
              break;
            }
            case 88: {

              jCGPKAGJIOF_ = input.readUInt32();
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.ClientCollectorDataOuterClass.internal_static_ClientCollectorData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.ClientCollectorDataOuterClass.internal_static_ClientCollectorData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.ClientCollectorDataOuterClass.ClientCollectorData.class, emu.grasscutter.net.proto.ClientCollectorDataOuterClass.ClientCollectorData.Builder.class);
    }

    public static final int BJAOMANHLNM_FIELD_NUMBER = 9;
    private int bJAOMANHLNM_;
    /**
     * <code>uint32 BJAOMANHLNM = 9;</code>
     * @return The bJAOMANHLNM.
     */
    @java.lang.Override
    public int getBJAOMANHLNM() {
      return bJAOMANHLNM_;
    }

    public static final int MATERIAL_ID_FIELD_NUMBER = 10;
    private int materialId_;
    /**
     * <code>uint32 material_id = 10;</code>
     * @return The materialId.
     */
    @java.lang.Override
    public int getMaterialId() {
      return materialId_;
    }

    public static final int JCGPKAGJIOF_FIELD_NUMBER = 11;
    private int jCGPKAGJIOF_;
    /**
     * <code>uint32 JCGPKAGJIOF = 11;</code>
     * @return The jCGPKAGJIOF.
     */
    @java.lang.Override
    public int getJCGPKAGJIOF() {
      return jCGPKAGJIOF_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (bJAOMANHLNM_ != 0) {
        output.writeUInt32(9, bJAOMANHLNM_);
      }
      if (materialId_ != 0) {
        output.writeUInt32(10, materialId_);
      }
      if (jCGPKAGJIOF_ != 0) {
        output.writeUInt32(11, jCGPKAGJIOF_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (bJAOMANHLNM_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, bJAOMANHLNM_);
      }
      if (materialId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, materialId_);
      }
      if (jCGPKAGJIOF_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, jCGPKAGJIOF_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.grasscutter.net.proto.ClientCollectorDataOuterClass.ClientCollectorData)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.ClientCollectorDataOuterClass.ClientCollectorData other = (emu.grasscutter.net.proto.ClientCollectorDataOuterClass.ClientCollectorData) obj;

      if (getBJAOMANHLNM()
          != other.getBJAOMANHLNM()) return false;
      if (getMaterialId()
          != other.getMaterialId()) return false;
      if (getJCGPKAGJIOF()
          != other.getJCGPKAGJIOF()) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + BJAOMANHLNM_FIELD_NUMBER;
      hash = (53 * hash) + getBJAOMANHLNM();
      hash = (37 * hash) + MATERIAL_ID_FIELD_NUMBER;
      hash = (53 * hash) + getMaterialId();
      hash = (37 * hash) + JCGPKAGJIOF_FIELD_NUMBER;
      hash = (53 * hash) + getJCGPKAGJIOF();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.ClientCollectorDataOuterClass.ClientCollectorData parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ClientCollectorDataOuterClass.ClientCollectorData parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ClientCollectorDataOuterClass.ClientCollectorData parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ClientCollectorDataOuterClass.ClientCollectorData parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ClientCollectorDataOuterClass.ClientCollectorData parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ClientCollectorDataOuterClass.ClientCollectorData parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ClientCollectorDataOuterClass.ClientCollectorData parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ClientCollectorDataOuterClass.ClientCollectorData parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ClientCollectorDataOuterClass.ClientCollectorData parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ClientCollectorDataOuterClass.ClientCollectorData parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ClientCollectorDataOuterClass.ClientCollectorData parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ClientCollectorDataOuterClass.ClientCollectorData parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(emu.grasscutter.net.proto.ClientCollectorDataOuterClass.ClientCollectorData prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     * Name: IPICMDDHCHD
     * </pre>
     *
     * Protobuf type {@code ClientCollectorData}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ClientCollectorData)
        emu.grasscutter.net.proto.ClientCollectorDataOuterClass.ClientCollectorDataOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.ClientCollectorDataOuterClass.internal_static_ClientCollectorData_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.ClientCollectorDataOuterClass.internal_static_ClientCollectorData_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.ClientCollectorDataOuterClass.ClientCollectorData.class, emu.grasscutter.net.proto.ClientCollectorDataOuterClass.ClientCollectorData.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.ClientCollectorDataOuterClass.ClientCollectorData.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        bJAOMANHLNM_ = 0;

        materialId_ = 0;

        jCGPKAGJIOF_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.ClientCollectorDataOuterClass.internal_static_ClientCollectorData_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ClientCollectorDataOuterClass.ClientCollectorData getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.ClientCollectorDataOuterClass.ClientCollectorData.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ClientCollectorDataOuterClass.ClientCollectorData build() {
        emu.grasscutter.net.proto.ClientCollectorDataOuterClass.ClientCollectorData result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ClientCollectorDataOuterClass.ClientCollectorData buildPartial() {
        emu.grasscutter.net.proto.ClientCollectorDataOuterClass.ClientCollectorData result = new emu.grasscutter.net.proto.ClientCollectorDataOuterClass.ClientCollectorData(this);
        result.bJAOMANHLNM_ = bJAOMANHLNM_;
        result.materialId_ = materialId_;
        result.jCGPKAGJIOF_ = jCGPKAGJIOF_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof emu.grasscutter.net.proto.ClientCollectorDataOuterClass.ClientCollectorData) {
          return mergeFrom((emu.grasscutter.net.proto.ClientCollectorDataOuterClass.ClientCollectorData)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.ClientCollectorDataOuterClass.ClientCollectorData other) {
        if (other == emu.grasscutter.net.proto.ClientCollectorDataOuterClass.ClientCollectorData.getDefaultInstance()) return this;
        if (other.getBJAOMANHLNM() != 0) {
          setBJAOMANHLNM(other.getBJAOMANHLNM());
        }
        if (other.getMaterialId() != 0) {
          setMaterialId(other.getMaterialId());
        }
        if (other.getJCGPKAGJIOF() != 0) {
          setJCGPKAGJIOF(other.getJCGPKAGJIOF());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        emu.grasscutter.net.proto.ClientCollectorDataOuterClass.ClientCollectorData parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.ClientCollectorDataOuterClass.ClientCollectorData) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bJAOMANHLNM_ ;
      /**
       * <code>uint32 BJAOMANHLNM = 9;</code>
       * @return The bJAOMANHLNM.
       */
      @java.lang.Override
      public int getBJAOMANHLNM() {
        return bJAOMANHLNM_;
      }
      /**
       * <code>uint32 BJAOMANHLNM = 9;</code>
       * @param value The bJAOMANHLNM to set.
       * @return This builder for chaining.
       */
      public Builder setBJAOMANHLNM(int value) {
        
        bJAOMANHLNM_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 BJAOMANHLNM = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearBJAOMANHLNM() {
        
        bJAOMANHLNM_ = 0;
        onChanged();
        return this;
      }

      private int materialId_ ;
      /**
       * <code>uint32 material_id = 10;</code>
       * @return The materialId.
       */
      @java.lang.Override
      public int getMaterialId() {
        return materialId_;
      }
      /**
       * <code>uint32 material_id = 10;</code>
       * @param value The materialId to set.
       * @return This builder for chaining.
       */
      public Builder setMaterialId(int value) {
        
        materialId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 material_id = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearMaterialId() {
        
        materialId_ = 0;
        onChanged();
        return this;
      }

      private int jCGPKAGJIOF_ ;
      /**
       * <code>uint32 JCGPKAGJIOF = 11;</code>
       * @return The jCGPKAGJIOF.
       */
      @java.lang.Override
      public int getJCGPKAGJIOF() {
        return jCGPKAGJIOF_;
      }
      /**
       * <code>uint32 JCGPKAGJIOF = 11;</code>
       * @param value The jCGPKAGJIOF to set.
       * @return This builder for chaining.
       */
      public Builder setJCGPKAGJIOF(int value) {
        
        jCGPKAGJIOF_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 JCGPKAGJIOF = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearJCGPKAGJIOF() {
        
        jCGPKAGJIOF_ = 0;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:ClientCollectorData)
    }

    // @@protoc_insertion_point(class_scope:ClientCollectorData)
    private static final emu.grasscutter.net.proto.ClientCollectorDataOuterClass.ClientCollectorData DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.ClientCollectorDataOuterClass.ClientCollectorData();
    }

    public static emu.grasscutter.net.proto.ClientCollectorDataOuterClass.ClientCollectorData getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ClientCollectorData>
        PARSER = new com.google.protobuf.AbstractParser<ClientCollectorData>() {
      @java.lang.Override
      public ClientCollectorData parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ClientCollectorData(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ClientCollectorData> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ClientCollectorData> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.ClientCollectorDataOuterClass.ClientCollectorData getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ClientCollectorData_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ClientCollectorData_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031ClientCollectorData.proto\"T\n\023ClientCol" +
      "lectorData\022\023\n\013BJAOMANHLNM\030\t \001(\r\022\023\n\013mater" +
      "ial_id\030\n \001(\r\022\023\n\013JCGPKAGJIOF\030\013 \001(\rB!\n\031emu" +
      ".grasscutter.net.protoZ\004/genb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ClientCollectorData_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ClientCollectorData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ClientCollectorData_descriptor,
        new java.lang.String[] { "BJAOMANHLNM", "MaterialId", "JCGPKAGJIOF", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
