// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GravenInnocencePhotoStageInfo.proto

package emu.grasscutter.net.proto;

public final class GravenInnocencePhotoStageInfoOuterClass {
  private GravenInnocencePhotoStageInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GravenInnocencePhotoStageInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GravenInnocencePhotoStageInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool is_finished = 2;</code>
     * @return The isFinished.
     */
    boolean getIsFinished();

    /**
     * <code>uint32 stage_id = 15;</code>
     * @return The stageId.
     */
    int getStageId();

    /**
     * <code>bool is_open = 3;</code>
     * @return The isOpen.
     */
    boolean getIsOpen();
  }
  /**
   * <pre>
   * Name: EPGGBJENFMN
   * </pre>
   *
   * Protobuf type {@code GravenInnocencePhotoStageInfo}
   */
  public static final class GravenInnocencePhotoStageInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GravenInnocencePhotoStageInfo)
      GravenInnocencePhotoStageInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GravenInnocencePhotoStageInfo.newBuilder() to construct.
    private GravenInnocencePhotoStageInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GravenInnocencePhotoStageInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GravenInnocencePhotoStageInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GravenInnocencePhotoStageInfo(
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

              isFinished_ = input.readBool();
              break;
            }
            case 24: {

              isOpen_ = input.readBool();
              break;
            }
            case 120: {

              stageId_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.GravenInnocencePhotoStageInfoOuterClass.internal_static_GravenInnocencePhotoStageInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.GravenInnocencePhotoStageInfoOuterClass.internal_static_GravenInnocencePhotoStageInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.GravenInnocencePhotoStageInfoOuterClass.GravenInnocencePhotoStageInfo.class, emu.grasscutter.net.proto.GravenInnocencePhotoStageInfoOuterClass.GravenInnocencePhotoStageInfo.Builder.class);
    }

    public static final int IS_FINISHED_FIELD_NUMBER = 2;
    private boolean isFinished_;
    /**
     * <code>bool is_finished = 2;</code>
     * @return The isFinished.
     */
    @java.lang.Override
    public boolean getIsFinished() {
      return isFinished_;
    }

    public static final int STAGE_ID_FIELD_NUMBER = 15;
    private int stageId_;
    /**
     * <code>uint32 stage_id = 15;</code>
     * @return The stageId.
     */
    @java.lang.Override
    public int getStageId() {
      return stageId_;
    }

    public static final int IS_OPEN_FIELD_NUMBER = 3;
    private boolean isOpen_;
    /**
     * <code>bool is_open = 3;</code>
     * @return The isOpen.
     */
    @java.lang.Override
    public boolean getIsOpen() {
      return isOpen_;
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
      if (isFinished_ != false) {
        output.writeBool(2, isFinished_);
      }
      if (isOpen_ != false) {
        output.writeBool(3, isOpen_);
      }
      if (stageId_ != 0) {
        output.writeUInt32(15, stageId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (isFinished_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(2, isFinished_);
      }
      if (isOpen_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(3, isOpen_);
      }
      if (stageId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, stageId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.GravenInnocencePhotoStageInfoOuterClass.GravenInnocencePhotoStageInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.GravenInnocencePhotoStageInfoOuterClass.GravenInnocencePhotoStageInfo other = (emu.grasscutter.net.proto.GravenInnocencePhotoStageInfoOuterClass.GravenInnocencePhotoStageInfo) obj;

      if (getIsFinished()
          != other.getIsFinished()) return false;
      if (getStageId()
          != other.getStageId()) return false;
      if (getIsOpen()
          != other.getIsOpen()) return false;
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
      hash = (37 * hash) + IS_FINISHED_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsFinished());
      hash = (37 * hash) + STAGE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getStageId();
      hash = (37 * hash) + IS_OPEN_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsOpen());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.GravenInnocencePhotoStageInfoOuterClass.GravenInnocencePhotoStageInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GravenInnocencePhotoStageInfoOuterClass.GravenInnocencePhotoStageInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GravenInnocencePhotoStageInfoOuterClass.GravenInnocencePhotoStageInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GravenInnocencePhotoStageInfoOuterClass.GravenInnocencePhotoStageInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GravenInnocencePhotoStageInfoOuterClass.GravenInnocencePhotoStageInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GravenInnocencePhotoStageInfoOuterClass.GravenInnocencePhotoStageInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GravenInnocencePhotoStageInfoOuterClass.GravenInnocencePhotoStageInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GravenInnocencePhotoStageInfoOuterClass.GravenInnocencePhotoStageInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GravenInnocencePhotoStageInfoOuterClass.GravenInnocencePhotoStageInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GravenInnocencePhotoStageInfoOuterClass.GravenInnocencePhotoStageInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GravenInnocencePhotoStageInfoOuterClass.GravenInnocencePhotoStageInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GravenInnocencePhotoStageInfoOuterClass.GravenInnocencePhotoStageInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.GravenInnocencePhotoStageInfoOuterClass.GravenInnocencePhotoStageInfo prototype) {
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
     * Name: EPGGBJENFMN
     * </pre>
     *
     * Protobuf type {@code GravenInnocencePhotoStageInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GravenInnocencePhotoStageInfo)
        emu.grasscutter.net.proto.GravenInnocencePhotoStageInfoOuterClass.GravenInnocencePhotoStageInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.GravenInnocencePhotoStageInfoOuterClass.internal_static_GravenInnocencePhotoStageInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.GravenInnocencePhotoStageInfoOuterClass.internal_static_GravenInnocencePhotoStageInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.GravenInnocencePhotoStageInfoOuterClass.GravenInnocencePhotoStageInfo.class, emu.grasscutter.net.proto.GravenInnocencePhotoStageInfoOuterClass.GravenInnocencePhotoStageInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.GravenInnocencePhotoStageInfoOuterClass.GravenInnocencePhotoStageInfo.newBuilder()
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
        isFinished_ = false;

        stageId_ = 0;

        isOpen_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.GravenInnocencePhotoStageInfoOuterClass.internal_static_GravenInnocencePhotoStageInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GravenInnocencePhotoStageInfoOuterClass.GravenInnocencePhotoStageInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.GravenInnocencePhotoStageInfoOuterClass.GravenInnocencePhotoStageInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GravenInnocencePhotoStageInfoOuterClass.GravenInnocencePhotoStageInfo build() {
        emu.grasscutter.net.proto.GravenInnocencePhotoStageInfoOuterClass.GravenInnocencePhotoStageInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GravenInnocencePhotoStageInfoOuterClass.GravenInnocencePhotoStageInfo buildPartial() {
        emu.grasscutter.net.proto.GravenInnocencePhotoStageInfoOuterClass.GravenInnocencePhotoStageInfo result = new emu.grasscutter.net.proto.GravenInnocencePhotoStageInfoOuterClass.GravenInnocencePhotoStageInfo(this);
        result.isFinished_ = isFinished_;
        result.stageId_ = stageId_;
        result.isOpen_ = isOpen_;
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
        if (other instanceof emu.grasscutter.net.proto.GravenInnocencePhotoStageInfoOuterClass.GravenInnocencePhotoStageInfo) {
          return mergeFrom((emu.grasscutter.net.proto.GravenInnocencePhotoStageInfoOuterClass.GravenInnocencePhotoStageInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.GravenInnocencePhotoStageInfoOuterClass.GravenInnocencePhotoStageInfo other) {
        if (other == emu.grasscutter.net.proto.GravenInnocencePhotoStageInfoOuterClass.GravenInnocencePhotoStageInfo.getDefaultInstance()) return this;
        if (other.getIsFinished() != false) {
          setIsFinished(other.getIsFinished());
        }
        if (other.getStageId() != 0) {
          setStageId(other.getStageId());
        }
        if (other.getIsOpen() != false) {
          setIsOpen(other.getIsOpen());
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
        emu.grasscutter.net.proto.GravenInnocencePhotoStageInfoOuterClass.GravenInnocencePhotoStageInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.GravenInnocencePhotoStageInfoOuterClass.GravenInnocencePhotoStageInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private boolean isFinished_ ;
      /**
       * <code>bool is_finished = 2;</code>
       * @return The isFinished.
       */
      @java.lang.Override
      public boolean getIsFinished() {
        return isFinished_;
      }
      /**
       * <code>bool is_finished = 2;</code>
       * @param value The isFinished to set.
       * @return This builder for chaining.
       */
      public Builder setIsFinished(boolean value) {
        
        isFinished_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_finished = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsFinished() {
        
        isFinished_ = false;
        onChanged();
        return this;
      }

      private int stageId_ ;
      /**
       * <code>uint32 stage_id = 15;</code>
       * @return The stageId.
       */
      @java.lang.Override
      public int getStageId() {
        return stageId_;
      }
      /**
       * <code>uint32 stage_id = 15;</code>
       * @param value The stageId to set.
       * @return This builder for chaining.
       */
      public Builder setStageId(int value) {
        
        stageId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 stage_id = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearStageId() {
        
        stageId_ = 0;
        onChanged();
        return this;
      }

      private boolean isOpen_ ;
      /**
       * <code>bool is_open = 3;</code>
       * @return The isOpen.
       */
      @java.lang.Override
      public boolean getIsOpen() {
        return isOpen_;
      }
      /**
       * <code>bool is_open = 3;</code>
       * @param value The isOpen to set.
       * @return This builder for chaining.
       */
      public Builder setIsOpen(boolean value) {
        
        isOpen_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_open = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsOpen() {
        
        isOpen_ = false;
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


      // @@protoc_insertion_point(builder_scope:GravenInnocencePhotoStageInfo)
    }

    // @@protoc_insertion_point(class_scope:GravenInnocencePhotoStageInfo)
    private static final emu.grasscutter.net.proto.GravenInnocencePhotoStageInfoOuterClass.GravenInnocencePhotoStageInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.GravenInnocencePhotoStageInfoOuterClass.GravenInnocencePhotoStageInfo();
    }

    public static emu.grasscutter.net.proto.GravenInnocencePhotoStageInfoOuterClass.GravenInnocencePhotoStageInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GravenInnocencePhotoStageInfo>
        PARSER = new com.google.protobuf.AbstractParser<GravenInnocencePhotoStageInfo>() {
      @java.lang.Override
      public GravenInnocencePhotoStageInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GravenInnocencePhotoStageInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GravenInnocencePhotoStageInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GravenInnocencePhotoStageInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.GravenInnocencePhotoStageInfoOuterClass.GravenInnocencePhotoStageInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GravenInnocencePhotoStageInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GravenInnocencePhotoStageInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n#GravenInnocencePhotoStageInfo.proto\"W\n" +
      "\035GravenInnocencePhotoStageInfo\022\023\n\013is_fin" +
      "ished\030\002 \001(\010\022\020\n\010stage_id\030\017 \001(\r\022\017\n\007is_open" +
      "\030\003 \001(\010B!\n\031emu.grasscutter.net.protoZ\004/ge" +
      "nb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_GravenInnocencePhotoStageInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GravenInnocencePhotoStageInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GravenInnocencePhotoStageInfo_descriptor,
        new java.lang.String[] { "IsFinished", "StageId", "IsOpen", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
