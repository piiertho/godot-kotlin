// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.reflect.KCallable
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class UndoRedo(
  _handle: COpaquePointer
) : Object(_handle) {
  /**
   * UndoRedo::version_changed signal
   */
  val signalVersionChanged: Signal0 = Signal0("version_changed")

  fun addDoMethod(
    `object`: Object,
    method: String,
    vararg varargs: Any?
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(`object`))
    _args.add(Variant.fromAny(method))
    varargs.forEach { _args.add(Variant.fromAny(it)) }
    __method_bind.addDoMethod.call(this._handle, _args)
  }

  fun addDoProperty(
    `object`: Object,
    property: String,
    value: Variant
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(`object`))
    _args.add(Variant.fromAny(property))
    _args.add(Variant.fromAny(value))
    __method_bind.addDoProperty.call(this._handle, _args)
  }

  fun addDoReference(`object`: Object) {
    val _arg = Variant.new(`object`)
    __method_bind.addDoReference.call(this._handle, listOf(_arg))
  }

  fun addUndoMethod(
    `object`: Object,
    method: String,
    vararg varargs: Any?
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(`object`))
    _args.add(Variant.fromAny(method))
    varargs.forEach { _args.add(Variant.fromAny(it)) }
    __method_bind.addUndoMethod.call(this._handle, _args)
  }

  fun addUndoProperty(
    `object`: Object,
    property: String,
    value: Variant
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(`object`))
    _args.add(Variant.fromAny(property))
    _args.add(Variant.fromAny(value))
    __method_bind.addUndoProperty.call(this._handle, _args)
  }

  fun addUndoReference(`object`: Object) {
    val _arg = Variant.new(`object`)
    __method_bind.addUndoReference.call(this._handle, listOf(_arg))
  }

  fun clearHistory(increaseVersion: Boolean = true) {
    val _arg = Variant.new(increaseVersion)
    __method_bind.clearHistory.call(this._handle, listOf(_arg))
  }

  fun commitAction() {
    __method_bind.commitAction.call(this._handle)
  }

  fun createAction(name: String, mergeMode: Int = 0) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(name))
    _args.add(Variant.fromAny(mergeMode))
    __method_bind.createAction.call(this._handle, _args)
  }

  fun getCurrentActionName(): String {
    val _ret = __method_bind.getCurrentActionName.call(this._handle)
    return _ret.asString()
  }

  fun getVersion(): Int {
    val _ret = __method_bind.getVersion.call(this._handle)
    return _ret.asInt()
  }

  fun hasRedo(): Boolean {
    val _ret = __method_bind.hasRedo.call(this._handle)
    return _ret.asBoolean()
  }

  fun hasUndo(): Boolean {
    val _ret = __method_bind.hasUndo.call(this._handle)
    return _ret.asBoolean()
  }

  fun isCommitingAction(): Boolean {
    val _ret = __method_bind.isCommitingAction.call(this._handle)
    return _ret.asBoolean()
  }

  fun redo(): Boolean {
    val _ret = __method_bind.redo.call(this._handle)
    return _ret.asBoolean()
  }

  fun undo(): Boolean {
    val _ret = __method_bind.undo.call(this._handle)
    return _ret.asBoolean()
  }

  enum class MergeMode(
    val value: Int
  ) {
    MERGE_DISABLE(0),

    MERGE_ENDS(1),

    MERGE_ALL(2);

    companion object {
      fun from(value: Int): MergeMode {
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
    val MERGE_ALL: Int = 2

    val MERGE_DISABLE: Int = 0

    val MERGE_ENDS: Int = 1

    fun new(): UndoRedo = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("UndoRedo".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for UndoRedo" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      UndoRedo(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): UndoRedo = UndoRedo(ptr)
    /**
     * Container for method_bind pointers for UndoRedo
     */
    private object __method_bind {
      val addDoMethod: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("UndoRedo".cstr.ptr,
            "add_do_method".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_do_method" }
        }
      val addDoProperty: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("UndoRedo".cstr.ptr,
            "add_do_property".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_do_property" }
        }
      val addDoReference: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("UndoRedo".cstr.ptr,
            "add_do_reference".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_do_reference" }
        }
      val addUndoMethod: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("UndoRedo".cstr.ptr,
            "add_undo_method".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_undo_method" }
        }
      val addUndoProperty: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("UndoRedo".cstr.ptr,
            "add_undo_property".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_undo_property" }
        }
      val addUndoReference: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("UndoRedo".cstr.ptr,
            "add_undo_reference".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_undo_reference" }
        }
      val clearHistory: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("UndoRedo".cstr.ptr,
            "clear_history".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clear_history" }
        }
      val commitAction: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("UndoRedo".cstr.ptr,
            "commit_action".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method commit_action" }
        }
      val createAction: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("UndoRedo".cstr.ptr,
            "create_action".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method create_action" }
        }
      val getCurrentActionName: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("UndoRedo".cstr.ptr,
            "get_current_action_name".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_current_action_name" }
        }
      val getVersion: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("UndoRedo".cstr.ptr,
            "get_version".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_version" }
        }
      val hasRedo: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("UndoRedo".cstr.ptr,
            "has_redo".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method has_redo" }
        }
      val hasUndo: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("UndoRedo".cstr.ptr,
            "has_undo".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method has_undo" }
        }
      val isCommitingAction: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("UndoRedo".cstr.ptr,
            "is_commiting_action".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_commiting_action" }
        }
      val redo: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("UndoRedo".cstr.ptr,
            "redo".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method redo" }
        }
      val undo: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("UndoRedo".cstr.ptr,
            "undo".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method undo" }
        }}
  }
}
