//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/base/reflection/v2alpha1/reflection.proto

package cosmos.base.reflection.v2alpha1;

@kotlin.jvm.JvmSynthetic
inline fun getAuthnDescriptorRequest(block: cosmos.base.reflection.v2alpha1.GetAuthnDescriptorRequestKt.Dsl.() -> Unit): cosmos.base.reflection.v2alpha1.Reflection.GetAuthnDescriptorRequest =
  cosmos.base.reflection.v2alpha1.GetAuthnDescriptorRequestKt.Dsl._create(cosmos.base.reflection.v2alpha1.Reflection.GetAuthnDescriptorRequest.newBuilder()).apply { block() }._build()
object GetAuthnDescriptorRequestKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    @kotlin.jvm.JvmField private val _builder: cosmos.base.reflection.v2alpha1.Reflection.GetAuthnDescriptorRequest.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.base.reflection.v2alpha1.Reflection.GetAuthnDescriptorRequest.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.base.reflection.v2alpha1.Reflection.GetAuthnDescriptorRequest = _builder.build()
  }
}
@kotlin.jvm.JvmSynthetic
inline fun cosmos.base.reflection.v2alpha1.Reflection.GetAuthnDescriptorRequest.copy(block: cosmos.base.reflection.v2alpha1.GetAuthnDescriptorRequestKt.Dsl.() -> Unit): cosmos.base.reflection.v2alpha1.Reflection.GetAuthnDescriptorRequest =
  cosmos.base.reflection.v2alpha1.GetAuthnDescriptorRequestKt.Dsl._create(this.toBuilder()).apply { block() }._build()
