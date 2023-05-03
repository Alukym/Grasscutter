// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GravenInnocencePhotoObjectInfo.proto

package emu.grasscutter.net.proto;

public final class GravenInnocencePhotoObjectInfoOuterClass {
  private GravenInnocencePhotoObjectInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GravenInnocencePhotoObjectInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GravenInnocencePhotoObjectInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 object_id = 2;</code>
     * @return The objectId.
     */
    int getObjectId();

    /**
     * <code>uint32 finish_time = 6;</code>
     * @return The finishTime.
     */
    int getFinishTime();

    /**
     * <code>uint32 param = 4;</code>
     * @return The param.
     */
    int getParam();
  }
  /**
   * <pre>
   * Name: MOJEBEBKDAF
   * </pre>
   *
   * Protobuf type {@code GravenInnocencePhotoObjectInfo}
   */
  public static final class GravenInnocencePhotoObjectInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GravenInnocencePhotoObjectInfo)
      GravenInnocencePhotoObjectInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GravenInnocencePhotoObjectInfo.newBuilder() to construct.
    private GravenInnocencePhotoObjectInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GravenInnocencePhotoObjectInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GravenInnocencePhotoObjectInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GravenInnocencePhotoObjectInfo(
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
            case 16: {

              objectId_ = input.readUInt32();
              break;
            }
            case 32: {

              param_ = input.readUInt32();
              break;
            }
            case 48: {

              finishTime_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.GravenInnocencePhotoObjectInfoOuterClass.internal_static_GravenInnocencePhotoObjectInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.GravenInnocencePhotoObjectInfoOuterClass.internal_static_GravenInnocencePhotoObjectInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.GravenInnocencePhotoObjectInfoOuterClass.GravenInnocencePhotoObjectInfo.class, emu.grasscutter.net.proto.GravenInnocencePhotoObjectInfoOuterClass.GravenInnocencePhotoObjectInfo.Builder.class);
    }

    public static final int OBJECT_ID_FIELD_NUMBER = 2;
    private int objectId_;
    /**
     * <code>uint32 object_id = 2;</code>
     * @return The objectId.
     */
    @java.lang.Override
    public int getObjectId() {
      return objectId_;
    }

    public static final int FINISH_TIME_FIELD_NUMBER = 6;
    private int finishTime_;
    /**
     * <code>uint32 finish_time = 6;</code>
     * @return The finishTime.
     */
    @java.lang.Override
    public int getFinishTime() {
      return finishTime_;
    }

    public static final int PARAM_FIELD_NUMBER = 4;
    private int param_;
    /**
     * <code>uint32 param = 4;</code>
     * @return The param.
     */
    @java.lang.Override
    public int getParam() {
      return param_;
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
      if (objectId_ != 0) {
        output.writeUInt32(2, objectId_);
      }
      if (param_ != 0) {
        output.writeUInt32(4, param_);
      }
      if (finishTime_ != 0) {
        output.writeUInt32(6, finishTime_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (objectId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, objectId_);
      }
      if (param_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, param_);
      }
      if (finishTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, finishTime_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.GravenInnocencePhotoObjectInfoOuterClass.GravenInnocencePhotoObjectInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.GravenInnocencePhotoObjectInfoOuterClass.GravenInnocencePhotoObjectInfo other = (emu.grasscutter.net.proto.GravenInnocencePhotoObjectInfoOuterClass.GravenInnocencePhotoObjectInfo) obj;

      if (getObjectId()
          != other.getObjectId()) return false;
      if (getFinishTime()
          != other.getFinishTime()) return false;
      if (getParam()
          != other.getParam()) return false;
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
      hash = (37 * hash) + OBJECT_ID_FIELD_NUMBER;
      hash = (53 * hash) + getObjectId();
      hash = (37 * hash) + FINISH_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getFinishTime();
      hash = (37 * hash) + PARAM_FIELD_NUMBER;
      hash = (53 * hash) + getParam();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.GravenInnocencePhotoObjectInfoOuterClass.GravenInnocencePhotoObjectInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GravenInnocencePhotoObjectInfoOuterClass.GravenInnocencePhotoObjectInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GravenInnocencePhotoObjectInfoOuterClass.GravenInnocencePhotoObjectInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GravenInnocencePhotoObjectInfoOuterClass.GravenInnocencePhotoObjectInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GravenInnocencePhotoObjectInfoOuterClass.GravenInnocencePhotoObjectInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GravenInnocencePhotoObjectInfoOuterClass.GravenInnocencePhotoObjectInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GravenInnocencePhotoObjectInfoOuterClass.GravenInnocencePhotoObjectInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GravenInnocencePhotoObjectInfoOuterClass.GravenInnocencePhotoObjectInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GravenInnocencePhotoObjectInfoOuterClass.GravenInnocencePhotoObjectInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GravenInnocencePhotoObjectInfoOuterClass.GravenInnocencePhotoObjectInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GravenInnocencePhotoObjectInfoOuterClass.GravenInnocencePhotoObjectInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GravenInnocencePhotoObjectInfoOuterClass.GravenInnocencePhotoObjectInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.GravenInnocencePhotoObjectInfoOuterClass.GravenInnocencePhotoObjectInfo prototype) {
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
     * Name: MOJEBEBKDAF
     * </pre>
     *
     * Protobuf type {@code GravenInnocencePhotoObjectInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GravenInnocencePhotoObjectInfo)
        emu.grasscutter.net.proto.GravenInnocencePhotoObjectInfoOuterClass.GravenInnocencePhotoObjectInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.GravenInnocencePhotoObjectInfoOuterClass.internal_static_GravenInnocencePhotoObjectInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.GravenInnocencePhotoObjectInfoOuterClass.internal_static_GravenInnocencePhotoObjectInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.GravenInnocencePhotoObjectInfoOuterClass.GravenInnocencePhotoObjectInfo.class, emu.grasscutter.net.proto.GravenInnocencePhotoObjectInfoOuterClass.GravenInnocencePhotoObjectInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.GravenInnocencePhotoObjectInfoOuterClass.GravenInnocencePhotoObjectInfo.newBuilder()
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
        objectId_ = 0;

        finishTime_ = 0;

        param_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.GravenInnocencePhotoObjectInfoOuterClass.internal_static_GravenInnocencePhotoObjectInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GravenInnocencePhotoObjectInfoOuterClass.GravenInnocencePhotoObjectInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.GravenInnocencePhotoObjectInfoOuterClass.GravenInnocencePhotoObjectInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GravenInnocencePhotoObjectInfoOuterClass.GravenInnocencePhotoObjectInfo build() {
        emu.grasscutter.net.proto.GravenInnocencePhotoObjectInfoOuterClass.GravenInnocencePhotoObjectInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GravenInnocencePhotoObjectInfoOuterClass.GravenInnocencePhotoObjectInfo buildPartial() {
        emu.grasscutter.net.proto.GravenInnocencePhotoObjectInfoOuterClass.GravenInnocencePhotoObjectInfo result = new emu.grasscutter.net.proto.GravenInnocencePhotoObjectInfoOuterClass.GravenInnocencePhotoObjectInfo(this);
        result.objectId_ = objectId_;
        result.finishTime_ = finishTime_;
        result.param_ = param_;
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
        if (other instanceof emu.grasscutter.net.proto.GravenInnocencePhotoObjectInfoOuterClass.GravenInnocencePhotoObjectInfo) {
          return mergeFrom((emu.grasscutter.net.proto.GravenInnocencePhotoObjectInfoOuterClass.GravenInnocencePhotoObjectInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.GravenInnocencePhotoObjectInfoOuterClass.GravenInnocencePhotoObjectInfo other) {
        if (other == emu.grasscutter.net.proto.GravenInnocencePhotoObjectInfoOuterClass.GravenInnocencePhotoObjectInfo.getDefaultInstance()) return this;
        if (other.getObjectId() != 0) {
          setObjectId(other.getObjectId());
        }
        if (other.getFinishTime() != 0) {
          setFinishTime(other.getFinishTime());
        }
        if (other.getParam() != 0) {
          setParam(other.getParam());
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
        emu.grasscutter.net.proto.GravenInnocencePhotoObjectInfoOuterClass.GravenInnocencePhotoObjectInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.GravenInnocencePhotoObjectInfoOuterClass.GravenInnocencePhotoObjectInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int objectId_ ;
      /**
       * <code>uint32 object_id = 2;</code>
       * @return The objectId.
       */
      @java.lang.Override
      public int getObjectId() {
        return objectId_;
      }
      /**
       * <code>uint32 object_id = 2;</code>
       * @param value The objectId to set.
       * @return This builder for chaining.
       */
      public Builder setObjectId(int value) {
        
        objectId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 object_id = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearObjectId() {
        
        objectId_ = 0;
        onChanged();
        return this;
      }

      private int finishTime_ ;
      /**
       * <code>uint32 finish_time = 6;</code>
       * @return The finishTime.
       */
      @java.lang.Override
      public int getFinishTime() {
        return finishTime_;
      }
      /**
       * <code>uint32 finish_time = 6;</code>
       * @param value The finishTime to set.
       * @return This builder for chaining.
       */
      public Builder setFinishTime(int value) {
        
        finishTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 finish_time = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearFinishTime() {
        
        finishTime_ = 0;
        onChanged();
        return this;
      }

      private int param_ ;
      /**
       * <code>uint32 param = 4;</code>
       * @return The param.
       */
      @java.lang.Override
      public int getParam() {
        return param_;
      }
      /**
       * <code>uint32 param = 4;</code>
       * @param value The param to set.
       * @return This builder for chaining.
       */
      public Builder setParam(int value) {
        
        param_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 param = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearParam() {
        
        param_ = 0;
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


      // @@protoc_insertion_point(builder_scope:GravenInnocencePhotoObjectInfo)
    }

    // @@protoc_insertion_point(class_scope:GravenInnocencePhotoObjectInfo)
    private static final emu.grasscutter.net.proto.GravenInnocencePhotoObjectInfoOuterClass.GravenInnocencePhotoObjectInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.GravenInnocencePhotoObjectInfoOuterClass.GravenInnocencePhotoObjectInfo();
    }

    public static emu.grasscutter.net.proto.GravenInnocencePhotoObjectInfoOuterClass.GravenInnocencePhotoObjectInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GravenInnocencePhotoObjectInfo>
        PARSER = new com.google.protobuf.AbstractParser<GravenInnocencePhotoObjectInfo>() {
      @java.lang.Override
      public GravenInnocencePhotoObjectInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GravenInnocencePhotoObjectInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GravenInnocencePhotoObjectInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GravenInnocencePhotoObjectInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.GravenInnocencePhotoObjectInfoOuterClass.GravenInnocencePhotoObjectInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GravenInnocencePhotoObjectInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GravenInnocencePhotoObjectInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n$GravenInnocencePhotoObjectInfo.proto\"W" +
      "\n\036GravenInnocencePhotoObjectInfo\022\021\n\tobje" +
      "ct_id\030\002 \001(\r\022\023\n\013finish_time\030\006 \001(\r\022\r\n\005para" +
      "m\030\004 \001(\rB!\n\031emu.grasscutter.net.protoZ\004/g" +
      "enb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_GravenInnocencePhotoObjectInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GravenInnocencePhotoObjectInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GravenInnocencePhotoObjectInfo_descriptor,
        new java.lang.String[] { "ObjectId", "FinishTime", "Param", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
