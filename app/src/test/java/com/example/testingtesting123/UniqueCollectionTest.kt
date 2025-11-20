package com.example.testingtesting123

import org.junit.Before
import org.junit.Test
import org.junit.Assert.assertEquals

class UniqueCollectionTest {

    lateinit var collection: UniqueCollection

    @Before
    fun setUp() {
        collection = UniqueCollection()
    }

    // TODO 1: Write a test to ensure items can be added to the collection
    @Test
    fun addAnItem() {
        val item = Item("Apple")
        collection.addItem(item)
        assertEquals(1, collection.size())
        assertEquals("Apple", collection.get(0).name)
    }

    // TODO 2: Write a test to ensure that only unique items can be added to the collection
    // Uniqueness is determined by the Item.name property, which is set via the constructor
    @Test
    fun addUniqueItem() {
        val item1 = Item("Banana")
        val item2 = Item("banana") // same name, different case
        collection.addItem(item1)
        collection.addItem(item2) // should not be added

        assertEquals(1, collection.size())
        assertEquals("Banana", collection.get(0).name)
    }

    // Test Driven Development (TDD) test - complete specified function so that this test passes
    @Test
    fun clearAllItems() {
        collection.addItem(Item("item1"))
        collection.addItem(Item("Item2"))

        val originalSize = collection.size()
        collection.clear()
        val newSize = collection.size()

        assert(originalSize == 2 && newSize == 0) { "Items not cleared" }
    }
}
