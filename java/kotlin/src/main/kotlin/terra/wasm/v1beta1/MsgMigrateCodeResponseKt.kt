//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: terra/wasm/v1beta1/tx.proto

package terra.wasm.v1beta1;

@kotlin.jvm.JvmSynthetic
inline fun msgMigrateCodeResponse(block: terra.wasm.v1beta1.MsgMigrateCodeResponseKt.Dsl.() -> Unit): terra.wasm.v1beta1.Tx.MsgMigrateCodeResponse =
  terra.wasm.v1beta1.MsgMigrateCodeResponseKt.Dsl._create(terra.wasm.v1beta1.Tx.MsgMigrateCodeResponse.newBuilder()).apply { block() }._build()
object MsgMigrateCodeResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    @kotlin.jvm.JvmField private val _builder: terra.wasm.v1beta1.Tx.MsgMigrateCodeResponse.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: terra.wasm.v1beta1.Tx.MsgMigrateCodeResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): terra.wasm.v1beta1.Tx.MsgMigrateCodeResponse = _builder.build()
  }
}
@kotlin.jvm.JvmSynthetic
inline fun terra.wasm.v1beta1.Tx.MsgMigrateCodeResponse.copy(block: terra.wasm.v1beta1.MsgMigrateCodeResponseKt.Dsl.() -> Unit): terra.wasm.v1beta1.Tx.MsgMigrateCodeResponse =
  terra.wasm.v1beta1.MsgMigrateCodeResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()
