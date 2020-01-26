// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Color
import godot.core.Godot
import kotlin.Boolean
import kotlin.String
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class EditorSpatialGizmoPlugin internal constructor(
  _handle: COpaquePointer
) : Resource(_handle) {
  fun addMaterial(name: String, material: SpatialMaterial) {
    TODO()
  }

  fun createHandleMaterial(name: String, billboard: Boolean) {
    TODO()
  }

  fun createIconMaterial(
    name: String,
    texture: Texture,
    on_top: Boolean,
    color: Color
  ) {
    TODO()
  }

  fun createMaterial(
    name: String,
    color: Color,
    billboard: Boolean,
    on_top: Boolean,
    use_vertex_color: Boolean
  ) {
    TODO()
  }

  fun getMaterial(name: String, gizmo: EditorSpatialGizmo): SpatialMaterial {
    TODO()
  }

  companion object {
    fun new(): EditorSpatialGizmoPlugin = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("EditorSpatialGizmoPlugin".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton EditorSpatialGizmoPlugin" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      EditorSpatialGizmoPlugin(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for EditorSpatialGizmoPlugin
     */
    private object __method_bind {
      val add_material: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorSpatialGizmoPlugin".cstr.ptr,
              "add_material".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_material" }
            }
          }

      val create_handle_material: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorSpatialGizmoPlugin".cstr.ptr,
              "create_handle_material".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method create_handle_material" }
            }
          }

      val create_icon_material: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorSpatialGizmoPlugin".cstr.ptr,
              "create_icon_material".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method create_icon_material" }
            }
          }

      val create_material: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorSpatialGizmoPlugin".cstr.ptr,
              "create_material".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method create_material" }
            }
          }

      val get_material: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorSpatialGizmoPlugin".cstr.ptr,
              "get_material".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_material" }
            }
          }
    }
  }
}
