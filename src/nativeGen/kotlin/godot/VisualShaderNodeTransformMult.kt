// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class VisualShaderNodeTransformMult internal constructor(
  _handle: COpaquePointer
) : VisualShaderNode(_handle) {
  fun getOperator(): Operator {
    val _ret = __method_bind.get_operator.call(this.toVariant())
    return VisualShaderNodeTransformMult.Operator.from(_ret.asInt())
  }

  fun setOperator(op: Int) {
    val _args = VariantArray.new()
    _args.append(op)
    __method_bind.set_operator.call(this.toVariant(), _args.toVariant(), 1)
  }

  enum class Operator(
    val value: Int
  ) {
    OP_AxB(0),

    OP_BxA(1),

    OP_AxB_COMP(2),

    OP_BxA_COMP(3);

    companion object {
      fun from(value: Int): Operator {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  companion object {
    val OP_AxB: Int = 0

    val OP_AxB_COMP: Int = 2

    val OP_BxA: Int = 1

    val OP_BxA_COMP: Int = 3

    fun new(): VisualShaderNodeTransformMult = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("VisualShaderNodeTransformMult".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton VisualShaderNodeTransformMult" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      VisualShaderNodeTransformMult(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): VisualShaderNodeTransformMult =
        VisualShaderNodeTransformMult(ptr)
    /**
     * Container for method_bind pointers for VisualShaderNodeTransformMult
     */
    private object __method_bind {
      val get_operator: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeTransformMult".cstr.ptr,
              "get_operator".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_operator" }
            }
          }

      val set_operator: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeTransformMult".cstr.ptr,
              "set_operator".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_operator" }
            }
          }
    }
  }
}
