// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PlayerApplyEnterMpResultReq.proto

package emu.grasscutter.net.proto;

public final class PlayerApplyEnterMpResultReqOuterClass {
  private PlayerApplyEnterMpResultReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PlayerApplyEnterMpResultReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:PlayerApplyEnterMpResultReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool is_agreed = 14;</code>
     * @return The isAgreed.
     */
    boolean getIsAgreed();

    /**
     * <code>uint32 apply_uid = 9;</code>
     * @return The applyUid.
     */
    int getApplyUid();
  }
  /**
   * <pre>
   * CmdId: 1815
   * Name: BAFPJDIIFJN
   * </pre>
   *
   * Protobuf type {@code PlayerApplyEnterMpResultReq}
   */
  public static final class PlayerApplyEnterMpResultReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:PlayerApplyEnterMpResultReq)
      PlayerApplyEnterMpResultReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PlayerApplyEnterMpResultReq.newBuilder() to construct.
    private PlayerApplyEnterMpResultReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PlayerApplyEnterMpResultReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new PlayerApplyEnterMpResultReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private PlayerApplyEnterMpResultReq(
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

              applyUid_ = input.readUInt32();
              break;
            }
            case 112: {

              isAgreed_ = input.readBool();
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
      return emu.grasscutter.net.proto.PlayerApplyEnterMpResultReqOuterClass.internal_static_PlayerApplyEnterMpResultReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.PlayerApplyEnterMpResultReqOuterClass.internal_static_PlayerApplyEnterMpResultReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.PlayerApplyEnterMpResultReqOuterClass.PlayerApplyEnterMpResultReq.class, emu.grasscutter.net.proto.PlayerApplyEnterMpResultReqOuterClass.PlayerApplyEnterMpResultReq.Builder.class);
    }

    public static final int IS_AGREED_FIELD_NUMBER = 14;
    private boolean isAgreed_;
    /**
     * <code>bool is_agreed = 14;</code>
     * @return The isAgreed.
     */
    @java.lang.Override
    public boolean getIsAgreed() {
      return isAgreed_;
    }

    public static final int APPLY_UID_FIELD_NUMBER = 9;
    private int applyUid_;
    /**
     * <code>uint32 apply_uid = 9;</code>
     * @return The applyUid.
     */
    @java.lang.Override
    public int getApplyUid() {
      return applyUid_;
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
      if (applyUid_ != 0) {
        output.writeUInt32(9, applyUid_);
      }
      if (isAgreed_ != false) {
        output.writeBool(14, isAgreed_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (applyUid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, applyUid_);
      }
      if (isAgreed_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(14, isAgreed_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.PlayerApplyEnterMpResultReqOuterClass.PlayerApplyEnterMpResultReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.PlayerApplyEnterMpResultReqOuterClass.PlayerApplyEnterMpResultReq other = (emu.grasscutter.net.proto.PlayerApplyEnterMpResultReqOuterClass.PlayerApplyEnterMpResultReq) obj;

      if (getIsAgreed()
          != other.getIsAgreed()) return false;
      if (getApplyUid()
          != other.getApplyUid()) return false;
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
      hash = (37 * hash) + IS_AGREED_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsAgreed());
      hash = (37 * hash) + APPLY_UID_FIELD_NUMBER;
      hash = (53 * hash) + getApplyUid();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.PlayerApplyEnterMpResultReqOuterClass.PlayerApplyEnterMpResultReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PlayerApplyEnterMpResultReqOuterClass.PlayerApplyEnterMpResultReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerApplyEnterMpResultReqOuterClass.PlayerApplyEnterMpResultReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PlayerApplyEnterMpResultReqOuterClass.PlayerApplyEnterMpResultReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerApplyEnterMpResultReqOuterClass.PlayerApplyEnterMpResultReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PlayerApplyEnterMpResultReqOuterClass.PlayerApplyEnterMpResultReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerApplyEnterMpResultReqOuterClass.PlayerApplyEnterMpResultReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PlayerApplyEnterMpResultReqOuterClass.PlayerApplyEnterMpResultReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerApplyEnterMpResultReqOuterClass.PlayerApplyEnterMpResultReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PlayerApplyEnterMpResultReqOuterClass.PlayerApplyEnterMpResultReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerApplyEnterMpResultReqOuterClass.PlayerApplyEnterMpResultReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PlayerApplyEnterMpResultReqOuterClass.PlayerApplyEnterMpResultReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.PlayerApplyEnterMpResultReqOuterClass.PlayerApplyEnterMpResultReq prototype) {
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
     * CmdId: 1815
     * Name: BAFPJDIIFJN
     * </pre>
     *
     * Protobuf type {@code PlayerApplyEnterMpResultReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:PlayerApplyEnterMpResultReq)
        emu.grasscutter.net.proto.PlayerApplyEnterMpResultReqOuterClass.PlayerApplyEnterMpResultReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.PlayerApplyEnterMpResultReqOuterClass.internal_static_PlayerApplyEnterMpResultReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.PlayerApplyEnterMpResultReqOuterClass.internal_static_PlayerApplyEnterMpResultReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.PlayerApplyEnterMpResultReqOuterClass.PlayerApplyEnterMpResultReq.class, emu.grasscutter.net.proto.PlayerApplyEnterMpResultReqOuterClass.PlayerApplyEnterMpResultReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.PlayerApplyEnterMpResultReqOuterClass.PlayerApplyEnterMpResultReq.newBuilder()
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
        isAgreed_ = false;

        applyUid_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.PlayerApplyEnterMpResultReqOuterClass.internal_static_PlayerApplyEnterMpResultReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PlayerApplyEnterMpResultReqOuterClass.PlayerApplyEnterMpResultReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.PlayerApplyEnterMpResultReqOuterClass.PlayerApplyEnterMpResultReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PlayerApplyEnterMpResultReqOuterClass.PlayerApplyEnterMpResultReq build() {
        emu.grasscutter.net.proto.PlayerApplyEnterMpResultReqOuterClass.PlayerApplyEnterMpResultReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PlayerApplyEnterMpResultReqOuterClass.PlayerApplyEnterMpResultReq buildPartial() {
        emu.grasscutter.net.proto.PlayerApplyEnterMpResultReqOuterClass.PlayerApplyEnterMpResultReq result = new emu.grasscutter.net.proto.PlayerApplyEnterMpResultReqOuterClass.PlayerApplyEnterMpResultReq(this);
        result.isAgreed_ = isAgreed_;
        result.applyUid_ = applyUid_;
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
        if (other instanceof emu.grasscutter.net.proto.PlayerApplyEnterMpResultReqOuterClass.PlayerApplyEnterMpResultReq) {
          return mergeFrom((emu.grasscutter.net.proto.PlayerApplyEnterMpResultReqOuterClass.PlayerApplyEnterMpResultReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.PlayerApplyEnterMpResultReqOuterClass.PlayerApplyEnterMpResultReq other) {
        if (other == emu.grasscutter.net.proto.PlayerApplyEnterMpResultReqOuterClass.PlayerApplyEnterMpResultReq.getDefaultInstance()) return this;
        if (other.getIsAgreed() != false) {
          setIsAgreed(other.getIsAgreed());
        }
        if (other.getApplyUid() != 0) {
          setApplyUid(other.getApplyUid());
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
        emu.grasscutter.net.proto.PlayerApplyEnterMpResultReqOuterClass.PlayerApplyEnterMpResultReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.PlayerApplyEnterMpResultReqOuterClass.PlayerApplyEnterMpResultReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private boolean isAgreed_ ;
      /**
       * <code>bool is_agreed = 14;</code>
       * @return The isAgreed.
       */
      @java.lang.Override
      public boolean getIsAgreed() {
        return isAgreed_;
      }
      /**
       * <code>bool is_agreed = 14;</code>
       * @param value The isAgreed to set.
       * @return This builder for chaining.
       */
      public Builder setIsAgreed(boolean value) {
        
        isAgreed_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_agreed = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsAgreed() {
        
        isAgreed_ = false;
        onChanged();
        return this;
      }

      private int applyUid_ ;
      /**
       * <code>uint32 apply_uid = 9;</code>
       * @return The applyUid.
       */
      @java.lang.Override
      public int getApplyUid() {
        return applyUid_;
      }
      /**
       * <code>uint32 apply_uid = 9;</code>
       * @param value The applyUid to set.
       * @return This builder for chaining.
       */
      public Builder setApplyUid(int value) {
        
        applyUid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 apply_uid = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearApplyUid() {
        
        applyUid_ = 0;
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


      // @@protoc_insertion_point(builder_scope:PlayerApplyEnterMpResultReq)
    }

    // @@protoc_insertion_point(class_scope:PlayerApplyEnterMpResultReq)
    private static final emu.grasscutter.net.proto.PlayerApplyEnterMpResultReqOuterClass.PlayerApplyEnterMpResultReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.PlayerApplyEnterMpResultReqOuterClass.PlayerApplyEnterMpResultReq();
    }

    public static emu.grasscutter.net.proto.PlayerApplyEnterMpResultReqOuterClass.PlayerApplyEnterMpResultReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PlayerApplyEnterMpResultReq>
        PARSER = new com.google.protobuf.AbstractParser<PlayerApplyEnterMpResultReq>() {
      @java.lang.Override
      public PlayerApplyEnterMpResultReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new PlayerApplyEnterMpResultReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<PlayerApplyEnterMpResultReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PlayerApplyEnterMpResultReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.PlayerApplyEnterMpResultReqOuterClass.PlayerApplyEnterMpResultReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PlayerApplyEnterMpResultReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PlayerApplyEnterMpResultReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n!PlayerApplyEnterMpResultReq.proto\"C\n\033P" +
      "layerApplyEnterMpResultReq\022\021\n\tis_agreed\030" +
      "\016 \001(\010\022\021\n\tapply_uid\030\t \001(\rB!\n\031emu.grasscut" +
      "ter.net.protoZ\004/genb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_PlayerApplyEnterMpResultReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PlayerApplyEnterMpResultReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PlayerApplyEnterMpResultReq_descriptor,
        new java.lang.String[] { "IsAgreed", "ApplyUid", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
