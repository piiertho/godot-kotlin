// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class GDScriptFunctionState internal constructor(
  _handle: COpaquePointer
) : Reference(_handle) {
  fun isValid(extendedCheck: Boolean): Boolean {
    val _args = VariantArray.new()
    _args.append(extendedCheck)
    val _ret = __method_bind.is_valid.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun resume(arg: Variant): Variant {
    val _args = VariantArray.new()
    _args.append(arg)
    val _ret = __method_bind.resume.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  companion object {
    /**
     * Container for method_bind pointers for GDScriptFunctionState
     */
    private object __method_bind {
      val is_valid: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GDScriptFunctionState".cstr.ptr,
              "is_valid".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_valid" }
            }
          }

      val resume: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GDScriptFunctionState".cstr.ptr,
              "resume".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method resume" }
            }
          }
    }
  }
}
