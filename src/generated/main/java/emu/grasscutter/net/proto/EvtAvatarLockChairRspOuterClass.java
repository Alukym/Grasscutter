// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: EvtAvatarLockChairRsp.proto

package emu.grasscutter.net.proto;

public final class EvtAvatarLockChairRspOuterClass {
  private EvtAvatarLockChairRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface EvtAvatarLockChairRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:EvtAvatarLockChairRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint64 chair_id = 4;</code>
     * @return The chairId.
     */
    long getChairId();

    /**
     * <code>.Vector position = 3;</code>
     * @return Whether the position field is set.
     */
    boolean hasPosition();
    /**
     * <code>.Vector position = 3;</code>
     * @return The position.
     */
    emu.grasscutter.net.proto.VectorOuterClass.Vector getPosition();
    /**
     * <code>.Vector position = 3;</code>
     */
    emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getPositionOrBuilder();

    /**
     * <code>int32 retcode = 9;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>uint32 entity_id = 7;</code>
     * @return The entityId.
     */
    int getEntityId();

    /**
     * <code>int32 direction = 2;</code>
     * @return The direction.
     */
    int getDirection();
  }
  /**
   * <pre>
   * CmdId: 26356
   * Obf: ABACJEJFCJJ
   * </pre>
   *
   * Protobuf type {@code EvtAvatarLockChairRsp}
   */
  public static final class EvtAvatarLockChairRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:EvtAvatarLockChairRsp)
      EvtAvatarLockChairRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use EvtAvatarLockChairRsp.newBuilder() to construct.
    private EvtAvatarLockChairRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private EvtAvatarLockChairRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new EvtAvatarLockChairRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private EvtAvatarLockChairRsp(
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

              direction_ = input.readInt32();
              break;
            }
            case 26: {
              emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder subBuilder = null;
              if (position_ != null) {
                subBuilder = position_.toBuilder();
              }
              position_ = input.readMessage(emu.grasscutter.net.proto.VectorOuterClass.Vector.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(position_);
                position_ = subBuilder.buildPartial();
              }

              break;
            }
            case 32: {

              chairId_ = input.readUInt64();
              break;
            }
            case 56: {

              entityId_ = input.readUInt32();
              break;
            }
            case 72: {

              retcode_ = input.readInt32();
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
      return emu.grasscutter.net.proto.EvtAvatarLockChairRspOuterClass.internal_static_EvtAvatarLockChairRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.EvtAvatarLockChairRspOuterClass.internal_static_EvtAvatarLockChairRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.EvtAvatarLockChairRspOuterClass.EvtAvatarLockChairRsp.class, emu.grasscutter.net.proto.EvtAvatarLockChairRspOuterClass.EvtAvatarLockChairRsp.Builder.class);
    }

    public static final int CHAIR_ID_FIELD_NUMBER = 4;
    private long chairId_;
    /**
     * <code>uint64 chair_id = 4;</code>
     * @return The chairId.
     */
    @java.lang.Override
    public long getChairId() {
      return chairId_;
    }

    public static final int POSITION_FIELD_NUMBER = 3;
    private emu.grasscutter.net.proto.VectorOuterClass.Vector position_;
    /**
     * <code>.Vector position = 3;</code>
     * @return Whether the position field is set.
     */
    @java.lang.Override
    public boolean hasPosition() {
      return position_ != null;
    }
    /**
     * <code>.Vector position = 3;</code>
     * @return The position.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.VectorOuterClass.Vector getPosition() {
      return position_ == null ? emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance() : position_;
    }
    /**
     * <code>.Vector position = 3;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getPositionOrBuilder() {
      return getPosition();
    }

    public static final int RETCODE_FIELD_NUMBER = 9;
    private int retcode_;
    /**
     * <code>int32 retcode = 9;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int ENTITY_ID_FIELD_NUMBER = 7;
    private int entityId_;
    /**
     * <code>uint32 entity_id = 7;</code>
     * @return The entityId.
     */
    @java.lang.Override
    public int getEntityId() {
      return entityId_;
    }

    public static final int DIRECTION_FIELD_NUMBER = 2;
    private int direction_;
    /**
     * <code>int32 direction = 2;</code>
     * @return The direction.
     */
    @java.lang.Override
    public int getDirection() {
      return direction_;
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
      if (direction_ != 0) {
        output.writeInt32(2, direction_);
      }
      if (position_ != null) {
        output.writeMessage(3, getPosition());
      }
      if (chairId_ != 0L) {
        output.writeUInt64(4, chairId_);
      }
      if (entityId_ != 0) {
        output.writeUInt32(7, entityId_);
      }
      if (retcode_ != 0) {
        output.writeInt32(9, retcode_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (direction_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, direction_);
      }
      if (position_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, getPosition());
      }
      if (chairId_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(4, chairId_);
      }
      if (entityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, entityId_);
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(9, retcode_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.EvtAvatarLockChairRspOuterClass.EvtAvatarLockChairRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.EvtAvatarLockChairRspOuterClass.EvtAvatarLockChairRsp other = (emu.grasscutter.net.proto.EvtAvatarLockChairRspOuterClass.EvtAvatarLockChairRsp) obj;

      if (getChairId()
          != other.getChairId()) return false;
      if (hasPosition() != other.hasPosition()) return false;
      if (hasPosition()) {
        if (!getPosition()
            .equals(other.getPosition())) return false;
      }
      if (getRetcode()
          != other.getRetcode()) return false;
      if (getEntityId()
          != other.getEntityId()) return false;
      if (getDirection()
          != other.getDirection()) return false;
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
      hash = (37 * hash) + CHAIR_ID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getChairId());
      if (hasPosition()) {
        hash = (37 * hash) + POSITION_FIELD_NUMBER;
        hash = (53 * hash) + getPosition().hashCode();
      }
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (37 * hash) + ENTITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getEntityId();
      hash = (37 * hash) + DIRECTION_FIELD_NUMBER;
      hash = (53 * hash) + getDirection();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.EvtAvatarLockChairRspOuterClass.EvtAvatarLockChairRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.EvtAvatarLockChairRspOuterClass.EvtAvatarLockChairRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EvtAvatarLockChairRspOuterClass.EvtAvatarLockChairRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.EvtAvatarLockChairRspOuterClass.EvtAvatarLockChairRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EvtAvatarLockChairRspOuterClass.EvtAvatarLockChairRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.EvtAvatarLockChairRspOuterClass.EvtAvatarLockChairRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EvtAvatarLockChairRspOuterClass.EvtAvatarLockChairRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.EvtAvatarLockChairRspOuterClass.EvtAvatarLockChairRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EvtAvatarLockChairRspOuterClass.EvtAvatarLockChairRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.EvtAvatarLockChairRspOuterClass.EvtAvatarLockChairRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EvtAvatarLockChairRspOuterClass.EvtAvatarLockChairRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.EvtAvatarLockChairRspOuterClass.EvtAvatarLockChairRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.EvtAvatarLockChairRspOuterClass.EvtAvatarLockChairRsp prototype) {
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
     * CmdId: 26356
     * Obf: ABACJEJFCJJ
     * </pre>
     *
     * Protobuf type {@code EvtAvatarLockChairRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:EvtAvatarLockChairRsp)
        emu.grasscutter.net.proto.EvtAvatarLockChairRspOuterClass.EvtAvatarLockChairRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.EvtAvatarLockChairRspOuterClass.internal_static_EvtAvatarLockChairRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.EvtAvatarLockChairRspOuterClass.internal_static_EvtAvatarLockChairRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.EvtAvatarLockChairRspOuterClass.EvtAvatarLockChairRsp.class, emu.grasscutter.net.proto.EvtAvatarLockChairRspOuterClass.EvtAvatarLockChairRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.EvtAvatarLockChairRspOuterClass.EvtAvatarLockChairRsp.newBuilder()
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
        chairId_ = 0L;

        if (positionBuilder_ == null) {
          position_ = null;
        } else {
          position_ = null;
          positionBuilder_ = null;
        }
        retcode_ = 0;

        entityId_ = 0;

        direction_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.EvtAvatarLockChairRspOuterClass.internal_static_EvtAvatarLockChairRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.EvtAvatarLockChairRspOuterClass.EvtAvatarLockChairRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.EvtAvatarLockChairRspOuterClass.EvtAvatarLockChairRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.EvtAvatarLockChairRspOuterClass.EvtAvatarLockChairRsp build() {
        emu.grasscutter.net.proto.EvtAvatarLockChairRspOuterClass.EvtAvatarLockChairRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.EvtAvatarLockChairRspOuterClass.EvtAvatarLockChairRsp buildPartial() {
        emu.grasscutter.net.proto.EvtAvatarLockChairRspOuterClass.EvtAvatarLockChairRsp result = new emu.grasscutter.net.proto.EvtAvatarLockChairRspOuterClass.EvtAvatarLockChairRsp(this);
        result.chairId_ = chairId_;
        if (positionBuilder_ == null) {
          result.position_ = position_;
        } else {
          result.position_ = positionBuilder_.build();
        }
        result.retcode_ = retcode_;
        result.entityId_ = entityId_;
        result.direction_ = direction_;
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
        if (other instanceof emu.grasscutter.net.proto.EvtAvatarLockChairRspOuterClass.EvtAvatarLockChairRsp) {
          return mergeFrom((emu.grasscutter.net.proto.EvtAvatarLockChairRspOuterClass.EvtAvatarLockChairRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.EvtAvatarLockChairRspOuterClass.EvtAvatarLockChairRsp other) {
        if (other == emu.grasscutter.net.proto.EvtAvatarLockChairRspOuterClass.EvtAvatarLockChairRsp.getDefaultInstance()) return this;
        if (other.getChairId() != 0L) {
          setChairId(other.getChairId());
        }
        if (other.hasPosition()) {
          mergePosition(other.getPosition());
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (other.getEntityId() != 0) {
          setEntityId(other.getEntityId());
        }
        if (other.getDirection() != 0) {
          setDirection(other.getDirection());
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
        emu.grasscutter.net.proto.EvtAvatarLockChairRspOuterClass.EvtAvatarLockChairRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.EvtAvatarLockChairRspOuterClass.EvtAvatarLockChairRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private long chairId_ ;
      /**
       * <code>uint64 chair_id = 4;</code>
       * @return The chairId.
       */
      @java.lang.Override
      public long getChairId() {
        return chairId_;
      }
      /**
       * <code>uint64 chair_id = 4;</code>
       * @param value The chairId to set.
       * @return This builder for chaining.
       */
      public Builder setChairId(long value) {
        
        chairId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 chair_id = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearChairId() {
        
        chairId_ = 0L;
        onChanged();
        return this;
      }

      private emu.grasscutter.net.proto.VectorOuterClass.Vector position_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.VectorOuterClass.Vector, emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder> positionBuilder_;
      /**
       * <code>.Vector position = 3;</code>
       * @return Whether the position field is set.
       */
      public boolean hasPosition() {
        return positionBuilder_ != null || position_ != null;
      }
      /**
       * <code>.Vector position = 3;</code>
       * @return The position.
       */
      public emu.grasscutter.net.proto.VectorOuterClass.Vector getPosition() {
        if (positionBuilder_ == null) {
          return position_ == null ? emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance() : position_;
        } else {
          return positionBuilder_.getMessage();
        }
      }
      /**
       * <code>.Vector position = 3;</code>
       */
      public Builder setPosition(emu.grasscutter.net.proto.VectorOuterClass.Vector value) {
        if (positionBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          position_ = value;
          onChanged();
        } else {
          positionBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.Vector position = 3;</code>
       */
      public Builder setPosition(
          emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder builderForValue) {
        if (positionBuilder_ == null) {
          position_ = builderForValue.build();
          onChanged();
        } else {
          positionBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.Vector position = 3;</code>
       */
      public Builder mergePosition(emu.grasscutter.net.proto.VectorOuterClass.Vector value) {
        if (positionBuilder_ == null) {
          if (position_ != null) {
            position_ =
              emu.grasscutter.net.proto.VectorOuterClass.Vector.newBuilder(position_).mergeFrom(value).buildPartial();
          } else {
            position_ = value;
          }
          onChanged();
        } else {
          positionBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.Vector position = 3;</code>
       */
      public Builder clearPosition() {
        if (positionBuilder_ == null) {
          position_ = null;
          onChanged();
        } else {
          position_ = null;
          positionBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.Vector position = 3;</code>
       */
      public emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder getPositionBuilder() {
        
        onChanged();
        return getPositionFieldBuilder().getBuilder();
      }
      /**
       * <code>.Vector position = 3;</code>
       */
      public emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getPositionOrBuilder() {
        if (positionBuilder_ != null) {
          return positionBuilder_.getMessageOrBuilder();
        } else {
          return position_ == null ?
              emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance() : position_;
        }
      }
      /**
       * <code>.Vector position = 3;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.VectorOuterClass.Vector, emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder> 
          getPositionFieldBuilder() {
        if (positionBuilder_ == null) {
          positionBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.VectorOuterClass.Vector, emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder>(
                  getPosition(),
                  getParentForChildren(),
                  isClean());
          position_ = null;
        }
        return positionBuilder_;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 9;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 9;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }

      private int entityId_ ;
      /**
       * <code>uint32 entity_id = 7;</code>
       * @return The entityId.
       */
      @java.lang.Override
      public int getEntityId() {
        return entityId_;
      }
      /**
       * <code>uint32 entity_id = 7;</code>
       * @param value The entityId to set.
       * @return This builder for chaining.
       */
      public Builder setEntityId(int value) {
        
        entityId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 entity_id = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearEntityId() {
        
        entityId_ = 0;
        onChanged();
        return this;
      }

      private int direction_ ;
      /**
       * <code>int32 direction = 2;</code>
       * @return The direction.
       */
      @java.lang.Override
      public int getDirection() {
        return direction_;
      }
      /**
       * <code>int32 direction = 2;</code>
       * @param value The direction to set.
       * @return This builder for chaining.
       */
      public Builder setDirection(int value) {
        
        direction_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 direction = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearDirection() {
        
        direction_ = 0;
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


      // @@protoc_insertion_point(builder_scope:EvtAvatarLockChairRsp)
    }

    // @@protoc_insertion_point(class_scope:EvtAvatarLockChairRsp)
    private static final emu.grasscutter.net.proto.EvtAvatarLockChairRspOuterClass.EvtAvatarLockChairRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.EvtAvatarLockChairRspOuterClass.EvtAvatarLockChairRsp();
    }

    public static emu.grasscutter.net.proto.EvtAvatarLockChairRspOuterClass.EvtAvatarLockChairRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<EvtAvatarLockChairRsp>
        PARSER = new com.google.protobuf.AbstractParser<EvtAvatarLockChairRsp>() {
      @java.lang.Override
      public EvtAvatarLockChairRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new EvtAvatarLockChairRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<EvtAvatarLockChairRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<EvtAvatarLockChairRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.EvtAvatarLockChairRspOuterClass.EvtAvatarLockChairRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EvtAvatarLockChairRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EvtAvatarLockChairRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033EvtAvatarLockChairRsp.proto\032\014Vector.pr" +
      "oto\"{\n\025EvtAvatarLockChairRsp\022\020\n\010chair_id" +
      "\030\004 \001(\004\022\031\n\010position\030\003 \001(\0132\007.Vector\022\017\n\007ret" +
      "code\030\t \001(\005\022\021\n\tentity_id\030\007 \001(\r\022\021\n\tdirecti" +
      "on\030\002 \001(\005B\033\n\031emu.grasscutter.net.protob\006p" +
      "roto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.VectorOuterClass.getDescriptor(),
        });
    internal_static_EvtAvatarLockChairRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_EvtAvatarLockChairRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EvtAvatarLockChairRsp_descriptor,
        new java.lang.String[] { "ChairId", "Position", "Retcode", "EntityId", "Direction", });
    emu.grasscutter.net.proto.VectorOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
