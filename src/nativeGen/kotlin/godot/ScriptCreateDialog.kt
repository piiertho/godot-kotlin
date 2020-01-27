// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.String
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class ScriptCreateDialog internal constructor(
  _handle: COpaquePointer
) : ConfirmationDialog(_handle) {
  fun config(
    inherits: String,
    path: String,
    builtInEnabled: Boolean
  ) {
    val _args = VariantArray.new()
    _args.append(inherits)
    _args.append(path)
    _args.append(builtInEnabled)
    val _ret = __method_bind.config.call(this.toVariant(), _args.toVariant(), 3)
    TODO()
  }

  companion object {
    fun new(): ScriptCreateDialog = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("ScriptCreateDialog".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton ScriptCreateDialog" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      ScriptCreateDialog(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): ScriptCreateDialog = ScriptCreateDialog(ptr)
    /**
     * Container for method_bind pointers for ScriptCreateDialog
     */
    private object __method_bind {
      val config: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScriptCreateDialog".cstr.ptr,
              "config".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method config" }
            }
          }
    }
  }
}
