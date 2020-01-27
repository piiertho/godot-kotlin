// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class _Directory internal constructor(
  _handle: COpaquePointer
) : Reference(_handle) {
  fun changeDir(todir: String): Error {
    val _args = VariantArray.new()
    _args.append(todir)
    val _ret = __method_bind.change_dir.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun copy(from: String, to: String): Error {
    val _args = VariantArray.new()
    _args.append(from)
    _args.append(to)
    val _ret = __method_bind.copy.call(this.toVariant(), _args.toVariant(), 2)
    TODO()
  }

  fun currentIsDir(): Boolean {
    val _ret = __method_bind.current_is_dir.call(this.toVariant())
    TODO()
  }

  fun dirExists(path: String): Boolean {
    val _args = VariantArray.new()
    _args.append(path)
    val _ret = __method_bind.dir_exists.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun fileExists(path: String): Boolean {
    val _args = VariantArray.new()
    _args.append(path)
    val _ret = __method_bind.file_exists.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun getCurrentDir(): String {
    val _ret = __method_bind.get_current_dir.call(this.toVariant())
    TODO()
  }

  fun getCurrentDrive(): Int {
    val _ret = __method_bind.get_current_drive.call(this.toVariant())
    TODO()
  }

  fun getDrive(idx: Int): String {
    val _args = VariantArray.new()
    _args.append(idx)
    val _ret = __method_bind.get_drive.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun getDriveCount(): Int {
    val _ret = __method_bind.get_drive_count.call(this.toVariant())
    TODO()
  }

  fun getNext(): String {
    val _ret = __method_bind.get_next.call(this.toVariant())
    TODO()
  }

  fun getSpaceLeft(): Int {
    val _ret = __method_bind.get_space_left.call(this.toVariant())
    TODO()
  }

  fun listDirBegin(skipNavigational: Boolean, skipHidden: Boolean): Error {
    val _args = VariantArray.new()
    _args.append(skipNavigational)
    _args.append(skipHidden)
    val _ret = __method_bind.list_dir_begin.call(this.toVariant(), _args.toVariant(), 2)
    TODO()
  }

  fun listDirEnd() {
    val _ret = __method_bind.list_dir_end.call(this.toVariant())
    TODO()
  }

  fun makeDir(path: String): Error {
    val _args = VariantArray.new()
    _args.append(path)
    val _ret = __method_bind.make_dir.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun makeDirRecursive(path: String): Error {
    val _args = VariantArray.new()
    _args.append(path)
    val _ret = __method_bind.make_dir_recursive.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun open(path: String): Error {
    val _args = VariantArray.new()
    _args.append(path)
    val _ret = __method_bind.open.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun remove(path: String): Error {
    val _args = VariantArray.new()
    _args.append(path)
    val _ret = __method_bind.remove.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun rename(from: String, to: String): Error {
    val _args = VariantArray.new()
    _args.append(from)
    _args.append(to)
    val _ret = __method_bind.rename.call(this.toVariant(), _args.toVariant(), 2)
    TODO()
  }

  companion object {
    fun new(): _Directory = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("_Directory".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton _Directory" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      _Directory(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): _Directory = _Directory(ptr)
    /**
     * Container for method_bind pointers for _Directory
     */
    private object __method_bind {
      val change_dir: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Directory".cstr.ptr,
              "change_dir".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method change_dir" }
            }
          }

      val copy: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Directory".cstr.ptr,
              "copy".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method copy" }
            }
          }

      val current_is_dir: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Directory".cstr.ptr,
              "current_is_dir".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method current_is_dir" }
            }
          }

      val dir_exists: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Directory".cstr.ptr,
              "dir_exists".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method dir_exists" }
            }
          }

      val file_exists: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Directory".cstr.ptr,
              "file_exists".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method file_exists" }
            }
          }

      val get_current_dir: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Directory".cstr.ptr,
              "get_current_dir".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_current_dir" }
            }
          }

      val get_current_drive: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Directory".cstr.ptr,
              "get_current_drive".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_current_drive" }
            }
          }

      val get_drive: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Directory".cstr.ptr,
              "get_drive".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_drive" }
            }
          }

      val get_drive_count: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Directory".cstr.ptr,
              "get_drive_count".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_drive_count" }
            }
          }

      val get_next: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Directory".cstr.ptr,
              "get_next".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_next" }
            }
          }

      val get_space_left: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Directory".cstr.ptr,
              "get_space_left".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_space_left" }
            }
          }

      val list_dir_begin: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Directory".cstr.ptr,
              "list_dir_begin".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method list_dir_begin" }
            }
          }

      val list_dir_end: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Directory".cstr.ptr,
              "list_dir_end".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method list_dir_end" }
            }
          }

      val make_dir: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Directory".cstr.ptr,
              "make_dir".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method make_dir" }
            }
          }

      val make_dir_recursive: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Directory".cstr.ptr,
              "make_dir_recursive".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method make_dir_recursive" }
            }
          }

      val open: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Directory".cstr.ptr,
              "open".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method open" }
            }
          }

      val remove: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Directory".cstr.ptr,
              "remove".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method remove" }
            }
          }

      val rename: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Directory".cstr.ptr,
              "rename".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method rename" }
            }
          }
    }
  }
}
