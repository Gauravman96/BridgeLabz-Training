import java.util.*;
class BrowserTab {

    private PageNode current;
    private Stack<PageNode> closedTabs;

    public BrowserTab() {
        closedTabs = new Stack<>();
    }

    // Visit a new page
    public void visit(String url) {
        PageNode newPage = new PageNode(url);

        if (current != null) {
            current.next = newPage;
            newPage.prev = current;
        }
        current = newPage;

        System.out.println("Visited: " + url);
    }

    public void back() {
        if (current != null && current.prev != null) {
            current = current.prev;
            System.out.println("Back to: " + current.url);
        } else {
            System.out.println("No page to go back.");
        }
    }

    // Go Forward
    public void forward() {
        if (current != null && current.next != null) {
            current = current.next;
            System.out.println("Forward to: " + current.url);
        } else {
            System.out.println("No page to go forward.");
        }
    }

    // Close current tab
    public void closeTab() {
        if (current == null) {
            System.out.println("No tab to close.");
            return;
        }

        closedTabs.push(current);
        System.out.println("Closed tab: " + current.url);

        current = current.prev; // move back safely
    }

    // Restore last closed tab
    public void restoreTab() {
        if (closedTabs.isEmpty()) {
            System.out.println("No closed tabs to restore.");
            return;
        }

        current = closedTabs.pop();
        System.out.println("Restored tab: " + current.url);
    }

    // Show current page
    public void showCurrentPage() {
        if (current != null) {
            System.out.println("Current Page: " + current.url);
        } else {
            System.out.println("No active page.");
        }
    }
}