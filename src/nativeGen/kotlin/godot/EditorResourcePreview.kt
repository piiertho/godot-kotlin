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

open class EditorResourcePreview internal constructor(
  _handle: COpaquePointer
) : Node(_handle) {
  fun addPreviewGenerator(generator: EditorResourcePreviewGenerator) {
    val _args = VariantArray.new()
    _args.append(generator)
    __method_bind.add_preview_generator.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun checkForInvalidation(path: String) {
    val _args = VariantArray.new()
    _args.append(path)
    __method_bind.check_for_invalidation.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun queueEditedResourcePreview(
    resource: Resource,
    receiver: Object,
    receiverFunc: String,
    userdata: Variant
  ) {
    val _args = VariantArray.new()
    _args.append(resource)
    _args.append(receiver)
    _args.append(receiverFunc)
    _args.append(userdata)
    __method_bind.queue_edited_resource_preview.call(this.toVariant(), _args.toVariant(), 4)
  }

  fun queueResourcePreview(
    path: String,
    receiver: Object,
    receiverFunc: String,
    userdata: Variant
  ) {
    val _args = VariantArray.new()
    _args.append(path)
    _args.append(receiver)
    _args.append(receiverFunc)
    _args.append(userdata)
    __method_bind.queue_resource_preview.call(this.toVariant(), _args.toVariant(), 4)
  }

  fun removePreviewGenerator(generator: EditorResourcePreviewGenerator) {
    val _args = VariantArray.new()
    _args.append(generator)
    __method_bind.remove_preview_generator.call(this.toVariant(), _args.toVariant(), 1)
  }

  companion object {
    /**
     * Container for method_bind pointers for EditorResourcePreview
     */
    private object __method_bind {
      val add_preview_generator: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorResourcePreview".cstr.ptr,
              "add_preview_generator".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_preview_generator" }
            }
          }

      val check_for_invalidation: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorResourcePreview".cstr.ptr,
              "check_for_invalidation".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method check_for_invalidation" }
            }
          }

      val queue_edited_resource_preview: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorResourcePreview".cstr.ptr,
              "queue_edited_resource_preview".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method queue_edited_resource_preview"
              }
            }
          }

      val queue_resource_preview: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorResourcePreview".cstr.ptr,
              "queue_resource_preview".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method queue_resource_preview" }
            }
          }

      val remove_preview_generator: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorResourcePreview".cstr.ptr,
              "remove_preview_generator".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method remove_preview_generator" }
            }
          }
    }
  }
}
