package com.pluralsight;

    public class Book {

        private int bookId;
        private String isbn;
        private String title;
        private boolean checkedOut;
        private String checkedOutTo;

        // The books start out not checked out, and so belong to no one (constructor)
        public Book(int bookId, String isbn, String title) {
            this.bookId = bookId;
            this.isbn = isbn;
            this.title = title;
            this.checkedOut = false;
            this.checkedOutTo = "";
        }

        // Methods to be used
        public void checkout(String name) {
            if (!checkedOut) {
                this.checkedOut = true;
                this.checkedOutTo = name;
                System.out.println(title + " has been checked out to " + name);
            } else {
                System.out.println(title + " is already checked out!");
            }
        }

        public void checkin() {
            if (checkedOut) {
                this.checkedOut = false;
                this.checkedOutTo = "";
                System.out.println(title + " has been checked in.");
            } else {
                System.out.println(title + " is not checked out.");
            }
        }

        // Getters and Setters
        public int getBookId() {
            return bookId;
        }

        public String getIsbn() {
            return isbn;
        }

        public String getTitle() {
            return title;
        }

        public boolean isCheckedOut() {
            return checkedOut;
        }

        public String getCheckedOutTo() {
            return checkedOutTo;
        }

        public void setBookId(int bookId) {
            this.bookId = bookId;
        }

        public void setIsbn(String isbn) {
            this.isbn = isbn;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public void setCheckedOut(boolean checkedOut) {
            this.checkedOut = checkedOut;
        }

        public void setCheckedOutTo(String checkedOutTo) {
            this.checkedOutTo = checkedOutTo;
        }
    }



