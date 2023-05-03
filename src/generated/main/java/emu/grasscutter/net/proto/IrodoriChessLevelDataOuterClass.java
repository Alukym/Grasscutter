// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IrodoriChessLevelData.proto

package emu.grasscutter.net.proto;

public final class IrodoriChessLevelDataOuterClass {
  private IrodoriChessLevelDataOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface IrodoriChessLevelDataOrBuilder extends
      // @@protoc_insertion_point(interface_extends:IrodoriChessLevelData)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.IrodoriChessMapData OEMKKEEKONG = 9;</code>
     * @return Whether the oEMKKEEKONG field is set.
     */
    boolean hasOEMKKEEKONG();
    /**
     * <code>.IrodoriChessMapData OEMKKEEKONG = 9;</code>
     * @return The oEMKKEEKONG.
     */
    emu.grasscutter.net.proto.IrodoriChessMapDataOuterClass.IrodoriChessMapData getOEMKKEEKONG();
    /**
     * <code>.IrodoriChessMapData OEMKKEEKONG = 9;</code>
     */
    emu.grasscutter.net.proto.IrodoriChessMapDataOuterClass.IrodoriChessMapDataOrBuilder getOEMKKEEKONGOrBuilder();

    /**
     * <code>uint32 level_id = 8;</code>
     * @return The levelId.
     */
    int getLevelId();

    /**
     * <code>.IrodoriChessMapData JCCNLMMCENC = 15;</code>
     * @return Whether the jCCNLMMCENC field is set.
     */
    boolean hasJCCNLMMCENC();
    /**
     * <code>.IrodoriChessMapData JCCNLMMCENC = 15;</code>
     * @return The jCCNLMMCENC.
     */
    emu.grasscutter.net.proto.IrodoriChessMapDataOuterClass.IrodoriChessMapData getJCCNLMMCENC();
    /**
     * <code>.IrodoriChessMapData JCCNLMMCENC = 15;</code>
     */
    emu.grasscutter.net.proto.IrodoriChessMapDataOuterClass.IrodoriChessMapDataOrBuilder getJCCNLMMCENCOrBuilder();

    /**
     * <code>uint32 open_time = 6;</code>
     * @return The openTime.
     */
    int getOpenTime();
  }
  /**
   * <pre>
   * Name: BBOCNPLHGAM
   * </pre>
   *
   * Protobuf type {@code IrodoriChessLevelData}
   */
  public static final class IrodoriChessLevelData extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:IrodoriChessLevelData)
      IrodoriChessLevelDataOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use IrodoriChessLevelData.newBuilder() to construct.
    private IrodoriChessLevelData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private IrodoriChessLevelData() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new IrodoriChessLevelData();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private IrodoriChessLevelData(
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
            case 48: {

              openTime_ = input.readUInt32();
              break;
            }
            case 64: {

              levelId_ = input.readUInt32();
              break;
            }
            case 74: {
              emu.grasscutter.net.proto.IrodoriChessMapDataOuterClass.IrodoriChessMapData.Builder subBuilder = null;
              if (oEMKKEEKONG_ != null) {
                subBuilder = oEMKKEEKONG_.toBuilder();
              }
              oEMKKEEKONG_ = input.readMessage(emu.grasscutter.net.proto.IrodoriChessMapDataOuterClass.IrodoriChessMapData.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(oEMKKEEKONG_);
                oEMKKEEKONG_ = subBuilder.buildPartial();
              }

              break;
            }
            case 122: {
              emu.grasscutter.net.proto.IrodoriChessMapDataOuterClass.IrodoriChessMapData.Builder subBuilder = null;
              if (jCCNLMMCENC_ != null) {
                subBuilder = jCCNLMMCENC_.toBuilder();
              }
              jCCNLMMCENC_ = input.readMessage(emu.grasscutter.net.proto.IrodoriChessMapDataOuterClass.IrodoriChessMapData.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(jCCNLMMCENC_);
                jCCNLMMCENC_ = subBuilder.buildPartial();
              }

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
      return emu.grasscutter.net.proto.IrodoriChessLevelDataOuterClass.internal_static_IrodoriChessLevelData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.IrodoriChessLevelDataOuterClass.internal_static_IrodoriChessLevelData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.IrodoriChessLevelDataOuterClass.IrodoriChessLevelData.class, emu.grasscutter.net.proto.IrodoriChessLevelDataOuterClass.IrodoriChessLevelData.Builder.class);
    }

    public static final int OEMKKEEKONG_FIELD_NUMBER = 9;
    private emu.grasscutter.net.proto.IrodoriChessMapDataOuterClass.IrodoriChessMapData oEMKKEEKONG_;
    /**
     * <code>.IrodoriChessMapData OEMKKEEKONG = 9;</code>
     * @return Whether the oEMKKEEKONG field is set.
     */
    @java.lang.Override
    public boolean hasOEMKKEEKONG() {
      return oEMKKEEKONG_ != null;
    }
    /**
     * <code>.IrodoriChessMapData OEMKKEEKONG = 9;</code>
     * @return The oEMKKEEKONG.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.IrodoriChessMapDataOuterClass.IrodoriChessMapData getOEMKKEEKONG() {
      return oEMKKEEKONG_ == null ? emu.grasscutter.net.proto.IrodoriChessMapDataOuterClass.IrodoriChessMapData.getDefaultInstance() : oEMKKEEKONG_;
    }
    /**
     * <code>.IrodoriChessMapData OEMKKEEKONG = 9;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.IrodoriChessMapDataOuterClass.IrodoriChessMapDataOrBuilder getOEMKKEEKONGOrBuilder() {
      return getOEMKKEEKONG();
    }

    public static final int LEVEL_ID_FIELD_NUMBER = 8;
    private int levelId_;
    /**
     * <code>uint32 level_id = 8;</code>
     * @return The levelId.
     */
    @java.lang.Override
    public int getLevelId() {
      return levelId_;
    }

    public static final int JCCNLMMCENC_FIELD_NUMBER = 15;
    private emu.grasscutter.net.proto.IrodoriChessMapDataOuterClass.IrodoriChessMapData jCCNLMMCENC_;
    /**
     * <code>.IrodoriChessMapData JCCNLMMCENC = 15;</code>
     * @return Whether the jCCNLMMCENC field is set.
     */
    @java.lang.Override
    public boolean hasJCCNLMMCENC() {
      return jCCNLMMCENC_ != null;
    }
    /**
     * <code>.IrodoriChessMapData JCCNLMMCENC = 15;</code>
     * @return The jCCNLMMCENC.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.IrodoriChessMapDataOuterClass.IrodoriChessMapData getJCCNLMMCENC() {
      return jCCNLMMCENC_ == null ? emu.grasscutter.net.proto.IrodoriChessMapDataOuterClass.IrodoriChessMapData.getDefaultInstance() : jCCNLMMCENC_;
    }
    /**
     * <code>.IrodoriChessMapData JCCNLMMCENC = 15;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.IrodoriChessMapDataOuterClass.IrodoriChessMapDataOrBuilder getJCCNLMMCENCOrBuilder() {
      return getJCCNLMMCENC();
    }

    public static final int OPEN_TIME_FIELD_NUMBER = 6;
    private int openTime_;
    /**
     * <code>uint32 open_time = 6;</code>
     * @return The openTime.
     */
    @java.lang.Override
    public int getOpenTime() {
      return openTime_;
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
      if (openTime_ != 0) {
        output.writeUInt32(6, openTime_);
      }
      if (levelId_ != 0) {
        output.writeUInt32(8, levelId_);
      }
      if (oEMKKEEKONG_ != null) {
        output.writeMessage(9, getOEMKKEEKONG());
      }
      if (jCCNLMMCENC_ != null) {
        output.writeMessage(15, getJCCNLMMCENC());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (openTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, openTime_);
      }
      if (levelId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, levelId_);
      }
      if (oEMKKEEKONG_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(9, getOEMKKEEKONG());
      }
      if (jCCNLMMCENC_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(15, getJCCNLMMCENC());
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
      if (!(obj instanceof emu.grasscutter.net.proto.IrodoriChessLevelDataOuterClass.IrodoriChessLevelData)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.IrodoriChessLevelDataOuterClass.IrodoriChessLevelData other = (emu.grasscutter.net.proto.IrodoriChessLevelDataOuterClass.IrodoriChessLevelData) obj;

      if (hasOEMKKEEKONG() != other.hasOEMKKEEKONG()) return false;
      if (hasOEMKKEEKONG()) {
        if (!getOEMKKEEKONG()
            .equals(other.getOEMKKEEKONG())) return false;
      }
      if (getLevelId()
          != other.getLevelId()) return false;
      if (hasJCCNLMMCENC() != other.hasJCCNLMMCENC()) return false;
      if (hasJCCNLMMCENC()) {
        if (!getJCCNLMMCENC()
            .equals(other.getJCCNLMMCENC())) return false;
      }
      if (getOpenTime()
          != other.getOpenTime()) return false;
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
      if (hasOEMKKEEKONG()) {
        hash = (37 * hash) + OEMKKEEKONG_FIELD_NUMBER;
        hash = (53 * hash) + getOEMKKEEKONG().hashCode();
      }
      hash = (37 * hash) + LEVEL_ID_FIELD_NUMBER;
      hash = (53 * hash) + getLevelId();
      if (hasJCCNLMMCENC()) {
        hash = (37 * hash) + JCCNLMMCENC_FIELD_NUMBER;
        hash = (53 * hash) + getJCCNLMMCENC().hashCode();
      }
      hash = (37 * hash) + OPEN_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getOpenTime();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.IrodoriChessLevelDataOuterClass.IrodoriChessLevelData parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.IrodoriChessLevelDataOuterClass.IrodoriChessLevelData parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.IrodoriChessLevelDataOuterClass.IrodoriChessLevelData parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.IrodoriChessLevelDataOuterClass.IrodoriChessLevelData parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.IrodoriChessLevelDataOuterClass.IrodoriChessLevelData parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.IrodoriChessLevelDataOuterClass.IrodoriChessLevelData parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.IrodoriChessLevelDataOuterClass.IrodoriChessLevelData parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.IrodoriChessLevelDataOuterClass.IrodoriChessLevelData parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.IrodoriChessLevelDataOuterClass.IrodoriChessLevelData parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.IrodoriChessLevelDataOuterClass.IrodoriChessLevelData parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.IrodoriChessLevelDataOuterClass.IrodoriChessLevelData parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.IrodoriChessLevelDataOuterClass.IrodoriChessLevelData parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.IrodoriChessLevelDataOuterClass.IrodoriChessLevelData prototype) {
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
     * Name: BBOCNPLHGAM
     * </pre>
     *
     * Protobuf type {@code IrodoriChessLevelData}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:IrodoriChessLevelData)
        emu.grasscutter.net.proto.IrodoriChessLevelDataOuterClass.IrodoriChessLevelDataOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.IrodoriChessLevelDataOuterClass.internal_static_IrodoriChessLevelData_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.IrodoriChessLevelDataOuterClass.internal_static_IrodoriChessLevelData_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.IrodoriChessLevelDataOuterClass.IrodoriChessLevelData.class, emu.grasscutter.net.proto.IrodoriChessLevelDataOuterClass.IrodoriChessLevelData.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.IrodoriChessLevelDataOuterClass.IrodoriChessLevelData.newBuilder()
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
        if (oEMKKEEKONGBuilder_ == null) {
          oEMKKEEKONG_ = null;
        } else {
          oEMKKEEKONG_ = null;
          oEMKKEEKONGBuilder_ = null;
        }
        levelId_ = 0;

        if (jCCNLMMCENCBuilder_ == null) {
          jCCNLMMCENC_ = null;
        } else {
          jCCNLMMCENC_ = null;
          jCCNLMMCENCBuilder_ = null;
        }
        openTime_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.IrodoriChessLevelDataOuterClass.internal_static_IrodoriChessLevelData_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.IrodoriChessLevelDataOuterClass.IrodoriChessLevelData getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.IrodoriChessLevelDataOuterClass.IrodoriChessLevelData.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.IrodoriChessLevelDataOuterClass.IrodoriChessLevelData build() {
        emu.grasscutter.net.proto.IrodoriChessLevelDataOuterClass.IrodoriChessLevelData result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.IrodoriChessLevelDataOuterClass.IrodoriChessLevelData buildPartial() {
        emu.grasscutter.net.proto.IrodoriChessLevelDataOuterClass.IrodoriChessLevelData result = new emu.grasscutter.net.proto.IrodoriChessLevelDataOuterClass.IrodoriChessLevelData(this);
        if (oEMKKEEKONGBuilder_ == null) {
          result.oEMKKEEKONG_ = oEMKKEEKONG_;
        } else {
          result.oEMKKEEKONG_ = oEMKKEEKONGBuilder_.build();
        }
        result.levelId_ = levelId_;
        if (jCCNLMMCENCBuilder_ == null) {
          result.jCCNLMMCENC_ = jCCNLMMCENC_;
        } else {
          result.jCCNLMMCENC_ = jCCNLMMCENCBuilder_.build();
        }
        result.openTime_ = openTime_;
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
        if (other instanceof emu.grasscutter.net.proto.IrodoriChessLevelDataOuterClass.IrodoriChessLevelData) {
          return mergeFrom((emu.grasscutter.net.proto.IrodoriChessLevelDataOuterClass.IrodoriChessLevelData)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.IrodoriChessLevelDataOuterClass.IrodoriChessLevelData other) {
        if (other == emu.grasscutter.net.proto.IrodoriChessLevelDataOuterClass.IrodoriChessLevelData.getDefaultInstance()) return this;
        if (other.hasOEMKKEEKONG()) {
          mergeOEMKKEEKONG(other.getOEMKKEEKONG());
        }
        if (other.getLevelId() != 0) {
          setLevelId(other.getLevelId());
        }
        if (other.hasJCCNLMMCENC()) {
          mergeJCCNLMMCENC(other.getJCCNLMMCENC());
        }
        if (other.getOpenTime() != 0) {
          setOpenTime(other.getOpenTime());
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
        emu.grasscutter.net.proto.IrodoriChessLevelDataOuterClass.IrodoriChessLevelData parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.IrodoriChessLevelDataOuterClass.IrodoriChessLevelData) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private emu.grasscutter.net.proto.IrodoriChessMapDataOuterClass.IrodoriChessMapData oEMKKEEKONG_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.IrodoriChessMapDataOuterClass.IrodoriChessMapData, emu.grasscutter.net.proto.IrodoriChessMapDataOuterClass.IrodoriChessMapData.Builder, emu.grasscutter.net.proto.IrodoriChessMapDataOuterClass.IrodoriChessMapDataOrBuilder> oEMKKEEKONGBuilder_;
      /**
       * <code>.IrodoriChessMapData OEMKKEEKONG = 9;</code>
       * @return Whether the oEMKKEEKONG field is set.
       */
      public boolean hasOEMKKEEKONG() {
        return oEMKKEEKONGBuilder_ != null || oEMKKEEKONG_ != null;
      }
      /**
       * <code>.IrodoriChessMapData OEMKKEEKONG = 9;</code>
       * @return The oEMKKEEKONG.
       */
      public emu.grasscutter.net.proto.IrodoriChessMapDataOuterClass.IrodoriChessMapData getOEMKKEEKONG() {
        if (oEMKKEEKONGBuilder_ == null) {
          return oEMKKEEKONG_ == null ? emu.grasscutter.net.proto.IrodoriChessMapDataOuterClass.IrodoriChessMapData.getDefaultInstance() : oEMKKEEKONG_;
        } else {
          return oEMKKEEKONGBuilder_.getMessage();
        }
      }
      /**
       * <code>.IrodoriChessMapData OEMKKEEKONG = 9;</code>
       */
      public Builder setOEMKKEEKONG(emu.grasscutter.net.proto.IrodoriChessMapDataOuterClass.IrodoriChessMapData value) {
        if (oEMKKEEKONGBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          oEMKKEEKONG_ = value;
          onChanged();
        } else {
          oEMKKEEKONGBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.IrodoriChessMapData OEMKKEEKONG = 9;</code>
       */
      public Builder setOEMKKEEKONG(
          emu.grasscutter.net.proto.IrodoriChessMapDataOuterClass.IrodoriChessMapData.Builder builderForValue) {
        if (oEMKKEEKONGBuilder_ == null) {
          oEMKKEEKONG_ = builderForValue.build();
          onChanged();
        } else {
          oEMKKEEKONGBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.IrodoriChessMapData OEMKKEEKONG = 9;</code>
       */
      public Builder mergeOEMKKEEKONG(emu.grasscutter.net.proto.IrodoriChessMapDataOuterClass.IrodoriChessMapData value) {
        if (oEMKKEEKONGBuilder_ == null) {
          if (oEMKKEEKONG_ != null) {
            oEMKKEEKONG_ =
              emu.grasscutter.net.proto.IrodoriChessMapDataOuterClass.IrodoriChessMapData.newBuilder(oEMKKEEKONG_).mergeFrom(value).buildPartial();
          } else {
            oEMKKEEKONG_ = value;
          }
          onChanged();
        } else {
          oEMKKEEKONGBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.IrodoriChessMapData OEMKKEEKONG = 9;</code>
       */
      public Builder clearOEMKKEEKONG() {
        if (oEMKKEEKONGBuilder_ == null) {
          oEMKKEEKONG_ = null;
          onChanged();
        } else {
          oEMKKEEKONG_ = null;
          oEMKKEEKONGBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.IrodoriChessMapData OEMKKEEKONG = 9;</code>
       */
      public emu.grasscutter.net.proto.IrodoriChessMapDataOuterClass.IrodoriChessMapData.Builder getOEMKKEEKONGBuilder() {
        
        onChanged();
        return getOEMKKEEKONGFieldBuilder().getBuilder();
      }
      /**
       * <code>.IrodoriChessMapData OEMKKEEKONG = 9;</code>
       */
      public emu.grasscutter.net.proto.IrodoriChessMapDataOuterClass.IrodoriChessMapDataOrBuilder getOEMKKEEKONGOrBuilder() {
        if (oEMKKEEKONGBuilder_ != null) {
          return oEMKKEEKONGBuilder_.getMessageOrBuilder();
        } else {
          return oEMKKEEKONG_ == null ?
              emu.grasscutter.net.proto.IrodoriChessMapDataOuterClass.IrodoriChessMapData.getDefaultInstance() : oEMKKEEKONG_;
        }
      }
      /**
       * <code>.IrodoriChessMapData OEMKKEEKONG = 9;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.IrodoriChessMapDataOuterClass.IrodoriChessMapData, emu.grasscutter.net.proto.IrodoriChessMapDataOuterClass.IrodoriChessMapData.Builder, emu.grasscutter.net.proto.IrodoriChessMapDataOuterClass.IrodoriChessMapDataOrBuilder> 
          getOEMKKEEKONGFieldBuilder() {
        if (oEMKKEEKONGBuilder_ == null) {
          oEMKKEEKONGBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.IrodoriChessMapDataOuterClass.IrodoriChessMapData, emu.grasscutter.net.proto.IrodoriChessMapDataOuterClass.IrodoriChessMapData.Builder, emu.grasscutter.net.proto.IrodoriChessMapDataOuterClass.IrodoriChessMapDataOrBuilder>(
                  getOEMKKEEKONG(),
                  getParentForChildren(),
                  isClean());
          oEMKKEEKONG_ = null;
        }
        return oEMKKEEKONGBuilder_;
      }

      private int levelId_ ;
      /**
       * <code>uint32 level_id = 8;</code>
       * @return The levelId.
       */
      @java.lang.Override
      public int getLevelId() {
        return levelId_;
      }
      /**
       * <code>uint32 level_id = 8;</code>
       * @param value The levelId to set.
       * @return This builder for chaining.
       */
      public Builder setLevelId(int value) {
        
        levelId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 level_id = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearLevelId() {
        
        levelId_ = 0;
        onChanged();
        return this;
      }

      private emu.grasscutter.net.proto.IrodoriChessMapDataOuterClass.IrodoriChessMapData jCCNLMMCENC_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.IrodoriChessMapDataOuterClass.IrodoriChessMapData, emu.grasscutter.net.proto.IrodoriChessMapDataOuterClass.IrodoriChessMapData.Builder, emu.grasscutter.net.proto.IrodoriChessMapDataOuterClass.IrodoriChessMapDataOrBuilder> jCCNLMMCENCBuilder_;
      /**
       * <code>.IrodoriChessMapData JCCNLMMCENC = 15;</code>
       * @return Whether the jCCNLMMCENC field is set.
       */
      public boolean hasJCCNLMMCENC() {
        return jCCNLMMCENCBuilder_ != null || jCCNLMMCENC_ != null;
      }
      /**
       * <code>.IrodoriChessMapData JCCNLMMCENC = 15;</code>
       * @return The jCCNLMMCENC.
       */
      public emu.grasscutter.net.proto.IrodoriChessMapDataOuterClass.IrodoriChessMapData getJCCNLMMCENC() {
        if (jCCNLMMCENCBuilder_ == null) {
          return jCCNLMMCENC_ == null ? emu.grasscutter.net.proto.IrodoriChessMapDataOuterClass.IrodoriChessMapData.getDefaultInstance() : jCCNLMMCENC_;
        } else {
          return jCCNLMMCENCBuilder_.getMessage();
        }
      }
      /**
       * <code>.IrodoriChessMapData JCCNLMMCENC = 15;</code>
       */
      public Builder setJCCNLMMCENC(emu.grasscutter.net.proto.IrodoriChessMapDataOuterClass.IrodoriChessMapData value) {
        if (jCCNLMMCENCBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          jCCNLMMCENC_ = value;
          onChanged();
        } else {
          jCCNLMMCENCBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.IrodoriChessMapData JCCNLMMCENC = 15;</code>
       */
      public Builder setJCCNLMMCENC(
          emu.grasscutter.net.proto.IrodoriChessMapDataOuterClass.IrodoriChessMapData.Builder builderForValue) {
        if (jCCNLMMCENCBuilder_ == null) {
          jCCNLMMCENC_ = builderForValue.build();
          onChanged();
        } else {
          jCCNLMMCENCBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.IrodoriChessMapData JCCNLMMCENC = 15;</code>
       */
      public Builder mergeJCCNLMMCENC(emu.grasscutter.net.proto.IrodoriChessMapDataOuterClass.IrodoriChessMapData value) {
        if (jCCNLMMCENCBuilder_ == null) {
          if (jCCNLMMCENC_ != null) {
            jCCNLMMCENC_ =
              emu.grasscutter.net.proto.IrodoriChessMapDataOuterClass.IrodoriChessMapData.newBuilder(jCCNLMMCENC_).mergeFrom(value).buildPartial();
          } else {
            jCCNLMMCENC_ = value;
          }
          onChanged();
        } else {
          jCCNLMMCENCBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.IrodoriChessMapData JCCNLMMCENC = 15;</code>
       */
      public Builder clearJCCNLMMCENC() {
        if (jCCNLMMCENCBuilder_ == null) {
          jCCNLMMCENC_ = null;
          onChanged();
        } else {
          jCCNLMMCENC_ = null;
          jCCNLMMCENCBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.IrodoriChessMapData JCCNLMMCENC = 15;</code>
       */
      public emu.grasscutter.net.proto.IrodoriChessMapDataOuterClass.IrodoriChessMapData.Builder getJCCNLMMCENCBuilder() {
        
        onChanged();
        return getJCCNLMMCENCFieldBuilder().getBuilder();
      }
      /**
       * <code>.IrodoriChessMapData JCCNLMMCENC = 15;</code>
       */
      public emu.grasscutter.net.proto.IrodoriChessMapDataOuterClass.IrodoriChessMapDataOrBuilder getJCCNLMMCENCOrBuilder() {
        if (jCCNLMMCENCBuilder_ != null) {
          return jCCNLMMCENCBuilder_.getMessageOrBuilder();
        } else {
          return jCCNLMMCENC_ == null ?
              emu.grasscutter.net.proto.IrodoriChessMapDataOuterClass.IrodoriChessMapData.getDefaultInstance() : jCCNLMMCENC_;
        }
      }
      /**
       * <code>.IrodoriChessMapData JCCNLMMCENC = 15;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.IrodoriChessMapDataOuterClass.IrodoriChessMapData, emu.grasscutter.net.proto.IrodoriChessMapDataOuterClass.IrodoriChessMapData.Builder, emu.grasscutter.net.proto.IrodoriChessMapDataOuterClass.IrodoriChessMapDataOrBuilder> 
          getJCCNLMMCENCFieldBuilder() {
        if (jCCNLMMCENCBuilder_ == null) {
          jCCNLMMCENCBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.IrodoriChessMapDataOuterClass.IrodoriChessMapData, emu.grasscutter.net.proto.IrodoriChessMapDataOuterClass.IrodoriChessMapData.Builder, emu.grasscutter.net.proto.IrodoriChessMapDataOuterClass.IrodoriChessMapDataOrBuilder>(
                  getJCCNLMMCENC(),
                  getParentForChildren(),
                  isClean());
          jCCNLMMCENC_ = null;
        }
        return jCCNLMMCENCBuilder_;
      }

      private int openTime_ ;
      /**
       * <code>uint32 open_time = 6;</code>
       * @return The openTime.
       */
      @java.lang.Override
      public int getOpenTime() {
        return openTime_;
      }
      /**
       * <code>uint32 open_time = 6;</code>
       * @param value The openTime to set.
       * @return This builder for chaining.
       */
      public Builder setOpenTime(int value) {
        
        openTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 open_time = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearOpenTime() {
        
        openTime_ = 0;
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


      // @@protoc_insertion_point(builder_scope:IrodoriChessLevelData)
    }

    // @@protoc_insertion_point(class_scope:IrodoriChessLevelData)
    private static final emu.grasscutter.net.proto.IrodoriChessLevelDataOuterClass.IrodoriChessLevelData DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.IrodoriChessLevelDataOuterClass.IrodoriChessLevelData();
    }

    public static emu.grasscutter.net.proto.IrodoriChessLevelDataOuterClass.IrodoriChessLevelData getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<IrodoriChessLevelData>
        PARSER = new com.google.protobuf.AbstractParser<IrodoriChessLevelData>() {
      @java.lang.Override
      public IrodoriChessLevelData parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new IrodoriChessLevelData(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<IrodoriChessLevelData> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<IrodoriChessLevelData> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.IrodoriChessLevelDataOuterClass.IrodoriChessLevelData getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_IrodoriChessLevelData_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_IrodoriChessLevelData_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033IrodoriChessLevelData.proto\032\031IrodoriCh" +
      "essMapData.proto\"\222\001\n\025IrodoriChessLevelDa" +
      "ta\022)\n\013OEMKKEEKONG\030\t \001(\0132\024.IrodoriChessMa" +
      "pData\022\020\n\010level_id\030\010 \001(\r\022)\n\013JCCNLMMCENC\030\017" +
      " \001(\0132\024.IrodoriChessMapData\022\021\n\topen_time\030" +
      "\006 \001(\rB!\n\031emu.grasscutter.net.protoZ\004/gen" +
      "b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.IrodoriChessMapDataOuterClass.getDescriptor(),
        });
    internal_static_IrodoriChessLevelData_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_IrodoriChessLevelData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_IrodoriChessLevelData_descriptor,
        new java.lang.String[] { "OEMKKEEKONG", "LevelId", "JCCNLMMCENC", "OpenTime", });
    emu.grasscutter.net.proto.IrodoriChessMapDataOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
