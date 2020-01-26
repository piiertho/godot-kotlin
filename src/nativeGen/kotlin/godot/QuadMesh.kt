// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Vector2
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class QuadMesh internal constructor(
  _handle: COpaquePointer
) : PrimitiveMesh(_handle) {
  fun getSize(): Vector2 {
    TODO()
  }

  fun setSize(size: Vector2) {
    TODO()
  }

  companion object {
    fun new(): QuadMesh = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("QuadMesh".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton QuadMesh" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      QuadMesh(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for QuadMesh
     */
    private object __method_bind {
      val get_size: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("QuadMesh".cstr.ptr,
              "get_size".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_size" }
            }
          }

      val set_size: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("QuadMesh".cstr.ptr,
              "set_size".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_size" }
            }
          }
    }
  }
}
