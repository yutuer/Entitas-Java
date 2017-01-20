package com.ilargia.games.entitas.caching;


import com.ilargia.games.entitas.factories.Collections;
import com.ilargia.games.entitas.interfaces.IComponent;
import com.ilargia.games.entitas.interfaces.events.GroupChanged;
import java.util.List;
import java.util.Set;

public class EntitasCache {

    private static ObjectPool<List<IComponent>> componentArray = new ObjectPool<List<IComponent>>(() -> {
        return Collections.createList(IComponent.class);
    }, null);
    private static ObjectPool<List> integerArray = new ObjectPool<List>(() -> {
        return Collections.createList(Integer.class);
    }, null);
    private static ObjectPool<Set> integerSet = new ObjectPool<Set>(() -> {
        return Collections.createSet(Integer.class);
    }, null);
    private static ObjectPool<List<GroupChanged>> groupChangedArray = new ObjectPool<List<GroupChanged>>(() -> {
        return Collections.createList(GroupChanged.class);
    }, null);


    public static List<IComponent> getIComponentList() {
        return componentArray.get();
    }

    public static void pushIComponentList(List<IComponent> list) {
        list.clear();
        componentArray.push(list);
    }

    public static List<Integer> getIntArray() {
        return integerArray.get();
    }

    public static void pushIntArray(List list) {
        list.clear();
        integerArray.push(list);
    }

    public static Set<Integer> getIntHashSet() {
        return integerSet.get();
    }

    public static void pushIntHashSet(Set hashSet) {
        hashSet.clear();
        integerSet.push(hashSet);
    }

    public static List<GroupChanged> getGroupChangedList() {
        return groupChangedArray.get();

    }

    public static void pushGroupChangedList(List<GroupChanged> list) {
        list.clear();
        groupChangedArray.push(list);
    }

    public static void reset() {
        componentArray.reset();
        integerArray.reset();
        integerSet.reset();
        groupChangedArray.reset();
    }
}
