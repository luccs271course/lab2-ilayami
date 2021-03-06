package edu.luc.cs.cs271.lab2;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.*;

public class SearchTest {
    Team[] makeArrayFixture(final int size) {
        final Team[] array = new Team[size];
        for (int i = 0; i < size; i++) {
            final String s = Integer.toString(i);
            array[i] = new Team("Team " + s, "Coach " + s, i * 100 + 50);
        }
        return array;
    }

    List<Team> makeListFixture(final int size) {
        final List<Team> list = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            final String s = Integer.toString(i);
            list.add(i, new Team("Team " + s, "Coach " + s, i * 100 + 50));
        }
        return list;
    }

    @Test
    public void testFindPositionArray0() {
        final Team[] arr = makeArrayFixture(0);
        assertFalse(Search.findTeamPosition(arr, "Team 5").isPresent());
    }

    @Test
    public void testFindPositionArray10s() {
        final Team[] arr = makeArrayFixture(10);
        assertTrue(Search.findTeamPosition(arr, "Team 5").isPresent());
    }

    @Test
    public void testFindPositionArray10f() {
        final Team[] arr = makeArrayFixture(10);
        assertFalse(Search.findTeamPosition(arr, "Team 11").isPresent());
    }

    // TODO: testFindPositionList0, 10s, 10f
    @Test
    public void testFindPositionList0() {
        final List<Team> list = makeListFixture(0);
        assertFalse(Search.findTeamPosition(list, "Team 5").isPresent());

    }

    @Test
    public void testFindPositionList10s() {
        final List<Team> list = makeListFixture(10);
        assertTrue(Search.findTeamPosition(list, "Team 5").isPresent());
    }

    @Test
    public void testFindPositionList10f() {
        final List<Team> list = makeListFixture(10);
        assertFalse(Search.findTeamPosition(list, "Team 11").isPresent());
    }

    // TODO: testFindMinFundingArray for several sizes and scenarios

    @Test
    public void findTeamMinFundingArray1() {
        final Team[] arr = makeArrayFixture(0);
        assertFalse(Search.findTeamMinFunding(arr, 700).isPresent());
    }

    @Test
    public void testFindMinFundingArray2() {
        final Team[] arr = makeArrayFixture(10);
        assertTrue(Search.findTeamMinFunding(arr, 500).isPresent());
    }

    @Test
    public void testFindMinFundingArray3() {
        final Team[] arr = makeArrayFixture(10);
        assertTrue(Search.findTeamMinFunding(arr, 700).isPresent());
    }

    // TODO: testFindMinFundingArrayFast for several sizes and scenarios
    @Test
    public void testFindMinFundingArrayFast() {
        final Team[] arr = makeArrayFixture(0);
        assertFalse(Search.findTeamMinFunding(arr, 500).isPresent());
    }
        @Test
        public void testFindMinFundingArrayFast1 () {
            final Team[] arr = makeArrayFixture(10);
            assertTrue(Search.findTeamMinFundingFast(arr, 600).isPresent());
        }

        @Test
        public void testFindMinFundingArrayFast2 () {
            final Team[] arr = makeArrayFixture(0);
            assertFalse(Search.findTeamMinFunding(arr, 700).isPresent());
        }

    }

