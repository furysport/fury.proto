//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: terra/wasm/v1beta1/tx.proto

package terra.wasm.v1beta1;

@kotlin.jvm.JvmSynthetic
inline fun msgMigrateCode(block: terra.wasm.v1beta1.MsgMigrateCodeKt.Dsl.() -> Unit): terra.wasm.v1beta1.Tx.MsgMigrateCode =
  terra.wasm.v1beta1.MsgMigrateCodeKt.Dsl._create(terra.wasm.v1beta1.Tx.MsgMigrateCode.newBuilder()).apply { block() }._build()
object MsgMigrateCodeKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    @kotlin.jvm.JvmField private val _builder: terra.wasm.v1beta1.Tx.MsgMigrateCode.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: terra.wasm.v1beta1.Tx.MsgMigrateCode.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): terra.wasm.v1beta1.Tx.MsgMigrateCode = _builder.build()

    /**
     * <pre>
     * CodeID is the migration target code id
     * </pre>
     *
     * <code>uint64 code_id = 1 [(.gogoproto.customname) = "CodeID", (.gogoproto.moretags) = "yaml:&#92;"code_id&#92;""];</code>
     */
    var codeId: kotlin.Long
      @JvmName("getCodeId")
      get() = _builder.getCodeId()
      @JvmName("setCodeId")
      set(value) {
        _builder.setCodeId(value)
      }
    /**
     * <pre>
     * CodeID is the migration target code id
     * </pre>
     *
     * <code>uint64 code_id = 1 [(.gogoproto.customname) = "CodeID", (.gogoproto.moretags) = "yaml:&#92;"code_id&#92;""];</code>
     */
    fun clearCodeId() {
      _builder.clearCodeId()
    }

    /**
     * <pre>
     * Sender is the that actor that signed the messages
     * </pre>
     *
     * <code>string sender = 2 [(.gogoproto.moretags) = "yaml:&#92;"sender&#92;""];</code>
     */
    var sender: kotlin.String
      @JvmName("getSender")
      get() = _builder.getSender()
      @JvmName("setSender")
      set(value) {
        _builder.setSender(value)
      }
    /**
     * <pre>
     * Sender is the that actor that signed the messages
     * </pre>
     *
     * <code>string sender = 2 [(.gogoproto.moretags) = "yaml:&#92;"sender&#92;""];</code>
     */
    fun clearSender() {
      _builder.clearSender()
    }

    /**
     * <pre>
     * WASMByteCode can be raw or gzip compressed
     * </pre>
     *
     * <code>bytes wasm_byte_code = 3 [(.gogoproto.customname) = "WASMByteCode", (.gogoproto.moretags) = "yaml:&#92;"wasm_byte_code&#92;""];</code>
     */
    var wasmByteCode: com.google.protobuf.ByteString
      @JvmName("getWasmByteCode")
      get() = _builder.getWasmByteCode()
      @JvmName("setWasmByteCode")
      set(value) {
        _builder.setWasmByteCode(value)
      }
    /**
     * <pre>
     * WASMByteCode can be raw or gzip compressed
     * </pre>
     *
     * <code>bytes wasm_byte_code = 3 [(.gogoproto.customname) = "WASMByteCode", (.gogoproto.moretags) = "yaml:&#92;"wasm_byte_code&#92;""];</code>
     */
    fun clearWasmByteCode() {
      _builder.clearWasmByteCode()
    }
  }
}
@kotlin.jvm.JvmSynthetic
inline fun terra.wasm.v1beta1.Tx.MsgMigrateCode.copy(block: terra.wasm.v1beta1.MsgMigrateCodeKt.Dsl.() -> Unit): terra.wasm.v1beta1.Tx.MsgMigrateCode =
  terra.wasm.v1beta1.MsgMigrateCodeKt.Dsl._create(this.toBuilder()).apply { block() }._build()
