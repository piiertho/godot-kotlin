// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import godot.core.Vector2
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class InputEventGesture internal constructor(
  _handle: COpaquePointer
) : InputEventWithModifiers(_handle) {
  fun getPosition(): Vector2 {
    val _ret = __method_bind.get_position.call(this.toVariant())
    TODO()
  }

  fun setPosition(position: Vector2) {
    val _args = VariantArray.new()
    _args.append(position)
    val _ret = __method_bind.set_position.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  companion object {
    /**
     * Container for method_bind pointers for InputEventGesture
     */
    private object __method_bind {
      val get_position: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventGesture".cstr.ptr,
              "get_position".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_position" }
            }
          }

      val set_position: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventGesture".cstr.ptr,
              "set_position".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_position" }
            }
          }
    }
  }
}
