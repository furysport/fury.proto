//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: tendermint/abci/types.proto

package tendermint.abci;

@kotlin.jvm.JvmSynthetic
inline fun blockParams(block: tendermint.abci.BlockParamsKt.Dsl.() -> Unit): tendermint.abci.Types.BlockParams =
  tendermint.abci.BlockParamsKt.Dsl._create(tendermint.abci.Types.BlockParams.newBuilder()).apply { block() }._build()
object BlockParamsKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    @kotlin.jvm.JvmField private val _builder: tendermint.abci.Types.BlockParams.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: tendermint.abci.Types.BlockParams.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): tendermint.abci.Types.BlockParams = _builder.build()

    /**
     * <pre>
     * Note: must be greater than 0
     * </pre>
     *
     * <code>int64 max_bytes = 1;</code>
     */
    var maxBytes: kotlin.Long
      @JvmName("getMaxBytes")
      get() = _builder.getMaxBytes()
      @JvmName("setMaxBytes")
      set(value) {
        _builder.setMaxBytes(value)
      }
    /**
     * <pre>
     * Note: must be greater than 0
     * </pre>
     *
     * <code>int64 max_bytes = 1;</code>
     */
    fun clearMaxBytes() {
      _builder.clearMaxBytes()
    }

    /**
     * <pre>
     * Note: must be greater or equal to -1
     * </pre>
     *
     * <code>int64 max_gas = 2;</code>
     */
    var maxGas: kotlin.Long
      @JvmName("getMaxGas")
      get() = _builder.getMaxGas()
      @JvmName("setMaxGas")
      set(value) {
        _builder.setMaxGas(value)
      }
    /**
     * <pre>
     * Note: must be greater or equal to -1
     * </pre>
     *
     * <code>int64 max_gas = 2;</code>
     */
    fun clearMaxGas() {
      _builder.clearMaxGas()
    }
  }
}
@kotlin.jvm.JvmSynthetic
inline fun tendermint.abci.Types.BlockParams.copy(block: tendermint.abci.BlockParamsKt.Dsl.() -> Unit): tendermint.abci.Types.BlockParams =
  tendermint.abci.BlockParamsKt.Dsl._create(this.toBuilder()).apply { block() }._build()
