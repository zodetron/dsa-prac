package CRT;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Day6a {

    static class node {
        int data;
        node left;
        node right;

        node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    node root = null;

    public void Insert(int data) {
        node newnode = new node(data);

        if (root == null) {
            root = newnode;
            return;
        }

        Queue<node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            root = q.poll();

            if (root.left == null) {
                root.left = newnode;
                return;
            } else {
                q.add(root.left);
            }

            if (root.right == null) {
                root.right = newnode;
                return;
            } else {
                q.add(root.right);
            }
        }
    }

    public void Inorder(node root) {
        if (root == null) {
            return;
        }

        Inorder(root.left);
        System.out.print(root.data + " ");
        Inorder(root.right);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        Day6a t = new Day6a();

        do {
            System.out.println("1. Insert");
            System.out.println("2. Inorder");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter data: ");
                    int data = sc.nextInt();
                    t.Insert(data);
                    break;

                case 2:
                    t.Inorder(t.root);
                    System.out.println();
                    break;

                case 0:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while (choice != 0);

        sc.close();
    }
}