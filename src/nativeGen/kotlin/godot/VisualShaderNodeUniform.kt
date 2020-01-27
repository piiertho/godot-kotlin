// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.String
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class VisualShaderNodeUniform internal constructor(
  _handle: COpaquePointer
) : VisualShaderNode(_handle) {
  fun getUniformName(): String {
    val _ret = __method_bind.get_uniform_name.call(this.toVariant())
    return _ret.asString()
  }

  fun setUniformName(name: String) {
    val _args = VariantArray.new()
    _args.append(name)
    __method_bind.set_uniform_name.call(this.toVariant(), _args.toVariant(), 1)
  }

  companion object {
    /**
     * Container for method_bind pointers for VisualShaderNodeUniform
     */
    private object __method_bind {
      val get_uniform_name: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeUniform".cstr.ptr,
              "get_uniform_name".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_uniform_name" }
            }
          }

      val set_uniform_name: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeUniform".cstr.ptr,
              "set_uniform_name".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_uniform_name" }
            }
          }
    }
  }
}
