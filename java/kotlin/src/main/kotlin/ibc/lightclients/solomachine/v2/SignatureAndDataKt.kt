//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: ibc/lightclients/solomachine/v2/solomachine.proto

package ibc.lightclients.solomachine.v2;

@kotlin.jvm.JvmSynthetic
inline fun signatureAndData(block: ibc.lightclients.solomachine.v2.SignatureAndDataKt.Dsl.() -> Unit): ibc.lightclients.solomachine.v2.Solomachine.SignatureAndData =
  ibc.lightclients.solomachine.v2.SignatureAndDataKt.Dsl._create(ibc.lightclients.solomachine.v2.Solomachine.SignatureAndData.newBuilder()).apply { block() }._build()
object SignatureAndDataKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    @kotlin.jvm.JvmField private val _builder: ibc.lightclients.solomachine.v2.Solomachine.SignatureAndData.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: ibc.lightclients.solomachine.v2.Solomachine.SignatureAndData.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): ibc.lightclients.solomachine.v2.Solomachine.SignatureAndData = _builder.build()

    /**
     * <code>bytes signature = 1;</code>
     */
    var signature: com.google.protobuf.ByteString
      @JvmName("getSignature")
      get() = _builder.getSignature()
      @JvmName("setSignature")
      set(value) {
        _builder.setSignature(value)
      }
    /**
     * <code>bytes signature = 1;</code>
     */
    fun clearSignature() {
      _builder.clearSignature()
    }

    /**
     * <code>.ibc.lightclients.solomachine.v2.DataType data_type = 2 [(.gogoproto.moretags) = "yaml:&#92;"data_type&#92;""];</code>
     */
    var dataType: ibc.lightclients.solomachine.v2.Solomachine.DataType
      @JvmName("getDataType")
      get() = _builder.getDataType()
      @JvmName("setDataType")
      set(value) {
        _builder.setDataType(value)
      }
    /**
     * <code>.ibc.lightclients.solomachine.v2.DataType data_type = 2 [(.gogoproto.moretags) = "yaml:&#92;"data_type&#92;""];</code>
     */
    fun clearDataType() {
      _builder.clearDataType()
    }

    /**
     * <code>bytes data = 3;</code>
     */
    var data: com.google.protobuf.ByteString
      @JvmName("getData")
      get() = _builder.getData()
      @JvmName("setData")
      set(value) {
        _builder.setData(value)
      }
    /**
     * <code>bytes data = 3;</code>
     */
    fun clearData() {
      _builder.clearData()
    }

    /**
     * <code>uint64 timestamp = 4;</code>
     */
    var timestamp: kotlin.Long
      @JvmName("getTimestamp")
      get() = _builder.getTimestamp()
      @JvmName("setTimestamp")
      set(value) {
        _builder.setTimestamp(value)
      }
    /**
     * <code>uint64 timestamp = 4;</code>
     */
    fun clearTimestamp() {
      _builder.clearTimestamp()
    }
  }
}
@kotlin.jvm.JvmSynthetic
inline fun ibc.lightclients.solomachine.v2.Solomachine.SignatureAndData.copy(block: ibc.lightclients.solomachine.v2.SignatureAndDataKt.Dsl.() -> Unit): ibc.lightclients.solomachine.v2.Solomachine.SignatureAndData =
  ibc.lightclients.solomachine.v2.SignatureAndDataKt.Dsl._create(this.toBuilder()).apply { block() }._build()
